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
        tag(ConstantTag.FIELD_REF.tag());
    }

    private short classIndex;
    private short nameAndTypeIndex;

    @Override
    public void read(CPInfo cpInfo, ClassFileReader classFileReader, int currentEventIndex) {

    }
}
