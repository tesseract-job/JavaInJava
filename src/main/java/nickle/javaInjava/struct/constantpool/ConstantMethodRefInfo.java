package nickle.javaInjava.struct.constantpool;

import lombok.Builder;
import lombok.Data;
import nickle.javaInjava.parser.ClassFileReader;
import nickle.javaInjava.struct.constantpool.tag.ConstantTag;

import java.lang.reflect.Field;

/**
 * Created by wesley on 2019/11/24.
 */
@Data

public class ConstantMethodRefInfo extends CPInfo{

    {
        tag(ConstantTag.METHOD_REF.tag());
        u2("classIndex");
        u2("nameAndTypeIndex");
    }

    private short classIndex;
    private short nameAndTypeIndex;
    private static Field classIndexField;
    private static Field nameAndTypeIndexField;

    static  {
        try {
            classIndexField = ConstantClassInfo.class.getDeclaredField("classIndex");
            nameAndTypeIndexField = ConstantClassInfo.class.getDeclaredField("nameAndTypeIndex");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read(CPInfo cpInfo, ClassFileReader classFileReader, int currentEventIndex) {

    }
}
