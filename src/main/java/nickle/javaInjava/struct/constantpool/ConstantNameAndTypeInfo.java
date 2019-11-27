package nickle.javaInjava.struct.constantpool;

import lombok.Builder;
import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
@Builder
public class ConstantNameAndTypeInfo {
    private byte tag;
    private short nameIndex;
    private short descriptorIndex;
}
