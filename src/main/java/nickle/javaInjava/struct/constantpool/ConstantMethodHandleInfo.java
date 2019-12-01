package nickle.javaInjava.struct.constantpool;

import lombok.Data;
import nickle.javaInjava.parser.ClassFileReader;
import nickle.javaInjava.struct.constantpool.tag.ConstantTag;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class ConstantMethodHandleInfo extends CPInfo{

    {
        tag(ConstantTag.METHOD_HANDLE.tag());
    }

    private byte referencekind;
    private short referenceIndex;


}
