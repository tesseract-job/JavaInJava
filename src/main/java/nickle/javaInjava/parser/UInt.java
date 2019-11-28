package nickle.javaInjava.parser;

import nickle.javaInjava.struct.ClassFile;

import java.lang.reflect.Field;
import java.util.List;
import java.util.function.BiFunction;
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
    public void read(ClassFile classFile, ClassFileReader classFileReader,int currentEventIndex) {
        try {
            List<Event> events = getEvents();
            Event event = events.get(currentEventIndex);
            Field field = classType.getDeclaredField(event.getName());
            field.setAccessible(true);
            T apply = intReader.apply(classFileReader);
            field.set(classFile,apply);
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }
}
