package nickle.javaInjava.struct.constantpool;

import lombok.Builder;
import lombok.Data;
import nickle.javaInjava.parser.ClassFileReader;
import nickle.javaInjava.struct.constantpool.tag.ConstantTag;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class ConstantNameAndTypeInfo extends CPInfo{

    {
        u2("nameIndex");
        u2("descriptorIndex");
    }
    private byte tag;
    private short nameIndex;
    private short descriptorIndex;

}
