package nickle.javaInjava.parser;

import java.util.function.Function;

/**
 * @program: JavaInJava
 * @description:
 * @author: lixiao
 * @create: 2019-12-01 13:07
 **/
public class TableU2 extends Table<Short>{

    TableU2(Class<?> clazzType) {
        super((Class<Short>)clazzType, READ_U2);
    }

    @Override
    public void read(Object obj, ClassFileReader classFileReader) {
        super.read(obj, classFileReader);
    }

    @Override
    public Short[] readContent(ClassFileReader classFileReader, int count) {
        tTables = new Short[count];
        for (int i = 0; i < count; i++) {
            tTables[i] = READ_U2.apply(classFileReader);
        }
        return tTables;
    }


}
