package nickle.javaInjava.struct.constantpool;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class ConstantUtf8Info {
    private byte tag;
    private short length;
    private byte[] bytes;
}
