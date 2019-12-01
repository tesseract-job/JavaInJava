package nickle.javaInjava.struct.constantpool;

import lombok.Builder;
import lombok.Data;
import nickle.javaInjava.parser.ClassFileReader;
import nickle.javaInjava.parser.Event;
import nickle.javaInjava.struct.ClassFile;
import nickle.javaInjava.struct.constantpool.tag.ConstantTag;

import java.lang.reflect.Field;

/**
 * Created by wesley on 2019/11/24.
 */
@Data

public class ConstantMethodRefInfo extends CPInfo{

    {
        u2("classIndex");
        u2("nameAndTypeIndex");
    }
    private byte tag;
    private short classIndex;
    private short nameAndTypeIndex;

}
