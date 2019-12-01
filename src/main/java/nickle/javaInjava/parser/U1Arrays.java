package nickle.javaInjava.parser;

import java.lang.reflect.Field;

/**
 * @program: JavaInJava
 * @description:
 * @author: lixiao
 * @create: 2019-11-30 22:27
 **/
public class U1Arrays extends UInt{

    private String countFiledName;
    U1Arrays(String countFiledName) {
        super(null);
        this.countFiledName = countFiledName;
    }

    @Override
    public void read(Object obj, ClassFileReader classFileReader) {
        Class<?> aClass = obj.getClass();
        try {
            Field arrayCount = aClass.getDeclaredField(countFiledName);
            arrayCount.setAccessible(true);
            int count = Integer.valueOf(arrayCount.get(obj).toString());
            byte[] bytes = classFileReader.readBytes(count);
            Field bytesField = aClass.getDeclaredField(getName());
            bytesField.setAccessible(true);
            bytesField.set(obj,bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
