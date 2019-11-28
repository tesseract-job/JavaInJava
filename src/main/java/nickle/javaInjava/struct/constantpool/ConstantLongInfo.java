package nickle.javaInjava.struct.constantpool;

import lombok.Data;
import nickle.javaInjava.parser.ClassFileReader;
import nickle.javaInjava.struct.constantpool.tag.ConstantTag;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class ConstantLongInfo extends CPInfo{

    {
        tag(ConstantTag.LONG.tag());
    }
    private int highBytes;
    private int lowBytes;

    @Override
    public void read(CPInfo cpInfo, ClassFileReader classFileReader, int currentEventIndex) {

    }
}
