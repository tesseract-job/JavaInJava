package nickle.javaInjava.struct.constantpool;

import lombok.Builder;
import lombok.Data;
import nickle.javaInjava.parser.ClassFileReader;
import nickle.javaInjava.struct.constantpool.tag.ConstantTag;

/**
 * Created by wesley on 2019/11/24.
 */
@Data

public class ConstantFieldRefInfo extends CPInfo{

    {
        u2("classIndex");
        u2("nameAndTypeIndex");
    }

    private short classIndex;
    private short nameAndTypeIndex;


}
