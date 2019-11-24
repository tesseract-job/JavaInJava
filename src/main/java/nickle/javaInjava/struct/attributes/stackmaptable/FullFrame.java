package nickle.javaInjava.struct.attributes.stackmaptable;

import lombok.Data;
import nickle.javaInjava.struct.attributes.stackmaptable.variableinfo.VerificationTypeInfo;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class FullFrame {
    private byte frameType;
    private short offserDelta;
    private short numberOfLocals;
    private VerificationTypeInfo[] locals;
    private short numberOfStacks;
    private VerificationTypeInfo[] stacks;
}
