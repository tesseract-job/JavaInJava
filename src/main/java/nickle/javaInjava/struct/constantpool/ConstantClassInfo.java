package nickle.javaInjava.struct.constantpool;

import lombok.Builder;
import lombok.Data;
import nickle.javaInjava.parser.ClassFileReader;
import nickle.javaInjava.struct.ClassFile;
import nickle.javaInjava.struct.constantpool.tag.ConstantTag;

import java.lang.reflect.Field;

/**
 * Created by wesley on 2019/11/24.
 */
@Data

public class ConstantClassInfo extends CPInfo{

    {
        tag(ConstantTag.CLASS.tag());
        u2("nameIndex");
    }

    private short nameIndex;
    private Class<ConstantClassInfo> classType = ConstantClassInfo.class;

    @Override
    public void read(ClassFile classFile, ClassFileReader classFileReader,int currentEventIndex) {

    }

    @Override
    public void read(CPInfo cpInfo, ClassFileReader classFileReader, int currentEventIndex) {
        Field field;
        try {
            field = classType.getField(getEvents().get(currentEventIndex).getName());
            field.setAccessible(true);
            field.set(cpInfo,READ_U2.apply(classFileReader));

        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }

    }
}
