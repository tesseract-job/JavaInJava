package nickle.javaInjava.struct.constantpool;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class ConstantLongInfo {
    private byte tag;
    private int highBytes;
    private int lowBytes;
}
