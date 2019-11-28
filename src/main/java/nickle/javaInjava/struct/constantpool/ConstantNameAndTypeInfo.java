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
        tag(ConstantTag.NAME_AND_TYPE.tag());
    }

    private short nameIndex;
    private short descriptorIndex;

    @Override
    public void read(CPInfo cpInfo, ClassFileReader classFileReader, int currentEventIndex) {

    }
}
