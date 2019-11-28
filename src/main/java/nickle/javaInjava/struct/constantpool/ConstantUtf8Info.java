package nickle.javaInjava.struct.constantpool;

import lombok.Builder;
import lombok.Data;
import nickle.javaInjava.parser.ClassFileReader;
import nickle.javaInjava.struct.constantpool.tag.ConstantTag;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class ConstantUtf8Info extends CPInfo{

    {
        tag(ConstantTag.UTF8.tag());
    }

    private short length;
    private byte[] bytes;
    private String desc;


    @Override
    public void read(CPInfo cpInfo, ClassFileReader classFileReader, int currentEventIndex) {

    }
}
