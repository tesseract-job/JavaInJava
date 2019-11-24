package nickle.javaInjava.struct.constantpool;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class ConstantInvokeDynamicInfo {
    private byte tag;
    private short bootstrapMethodAttrIndex;
    private short nameAndTypeIndex;

}
