package nickle.javaInjava.struct.constantpool;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class ConstantDoubleInfo {
    private byte tag;
    private float highBytes;
    private float lowBytes;
}
