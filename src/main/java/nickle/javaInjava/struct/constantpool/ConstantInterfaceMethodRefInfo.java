package nickle.javaInjava.struct.constantpool;

import lombok.Data;
import nickle.javaInjava.parser.ClassFileReader;
import nickle.javaInjava.struct.constantpool.tag.ConstantTag;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class ConstantInterfaceMethodRefInfo extends CPInfo{

    {
        tag(ConstantTag.INTERFACE_METHODREF.tag());
    }

    private short classIndex;
    private short nameAndTypeIndex;

    @Override
    public void read(CPInfo cpInfo, ClassFileReader classFileReader, int currentEventIndex) {

    }
}
