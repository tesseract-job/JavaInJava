package nickle.javaInjava.parser;

import java.lang.reflect.Field;
import java.util.function.Function;

/**
 * @Description
 * @Author lixiao
 * @Data 2019/11/28 15:57
 * @Version 1.0
 **/
public class UInt<T> extends ClassFileEvent{

    private final Function<ClassFileReader, T> intReader;
    //private final BiFunction<Integer, ConstantPool, String> intDescriber;

    UInt(Function intReader){
        this.intReader = intReader;
    }

    @Override
    public void read(Object obj, ClassFileReader classFileReader){
        try {
            Field field = obj.getClass().getDeclaredField(getName());
            field.setAccessible(true);
            T apply = intReader.apply(classFileReader);
            field.set(obj,apply);
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }
}
