package nickle.javaInjava.parser;

import java.lang.reflect.Array;

/**
 * @program: JavaInJava
 * @description:
 * @author: lixiao
 * @create: 2019-12-01 13:42
 **/
public class CPInfoTable<T extends ClassFileEvent> extends Table<T> {
    CPInfoTable(Class clazzType) {
        super(clazzType, null);
    }


    @Override
    public T[] readContent(ClassFileReader classFileReader, int count) throws IllegalAccessException, InstantiationException {
        T[] classFileEvents = (T[]) Array.newInstance(clazzType,count);
        for (int i = 0; i < count; i++) {
            T t = clazzType.newInstance();
            t.read(t,classFileReader);
            classFileEvents[i] = t;
        }
        return classFileEvents;
    }
}
