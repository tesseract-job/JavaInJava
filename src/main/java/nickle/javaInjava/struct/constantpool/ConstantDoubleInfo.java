package nickle.javaInjava.struct.constantpool;

import lombok.Data;
import nickle.javaInjava.parser.ClassFileReader;
import nickle.javaInjava.struct.constantpool.tag.ConstantTag;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class ConstantDoubleInfo extends CPInfo{

    {
        tag(ConstantTag.DOUBLE.tag());
    }
    private byte tag;
    private float highBytes;
    private float lowBytes;

}
