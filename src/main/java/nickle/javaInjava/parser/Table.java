package nickle.javaInjava.parser;

import nickle.javaInjava.struct.ClassFile;

import java.lang.reflect.Field;
import java.util.function.Function;

/**
 * @program: JavaInJava
 * @description:
 * @author: lixiao
 * @create: 2019-12-01 12: 48
 **/
public abstract class Table<T> extends UInt {
    Table(Class<T> clazzType, Function function) {
        super(function);
        this.clazzType = clazzType;
    }
    protected Class<T> clazzType;
    protected T[] tTables;

    @Override
    public void read(Object obj, ClassFileReader classFileReader){
        Class<?> aClass = obj.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        Field fieldCount = null;
        for (int i = 0; i < declaredFields.length; i++) {
            boolean equals = getName().equals(declaredFields[i].getName());
            if(equals && i > 0){
                fieldCount = declaredFields[i -1];
                break;
            }
        }
        if(fieldCount == null){
            return;
        }

        short interfacesCount = 0;
        try {
            fieldCount.setAccessible(true);
            Object o = fieldCount.get(obj);
            interfacesCount = (short)o;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(interfacesCount == 0){
            return;
        }
        if(interfacesCount < 0){
            throw new RuntimeException("接口数不合法");
        }
        try {
            tTables = readContent(classFileReader,interfacesCount);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        try {
            Field declaredField = obj.getClass().getDeclaredField(getName());
            declaredField.getType();
            declaredField.setAccessible(true);
            declaredField.set(obj,tTables);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    public abstract T[] readContent(ClassFileReader classFileReader, int count) throws IllegalAccessException, InstantiationException;
}
