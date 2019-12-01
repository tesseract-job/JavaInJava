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

public class ConstantClassInfo extends CPInfo{

    {
        u2("nameIndex");
    }
    private byte tag;
    private short nameIndex;

}
