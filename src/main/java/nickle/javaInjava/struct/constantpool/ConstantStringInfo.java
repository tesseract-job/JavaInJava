package nickle.javaInjava.struct.constantpool;

import lombok.Data;
import nickle.javaInjava.parser.ClassFileReader;
import nickle.javaInjava.parser.Event;
import nickle.javaInjava.struct.constantpool.tag.ConstantTag;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class ConstantStringInfo extends CPInfo {

    {
        tag(ConstantTag.INVOKE_DYNAMIC.tag());
    }
    private byte tag;
    private short stringIndex;




}
