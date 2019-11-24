package nickle.javaInjava.struct.attributes.stackmaptable;

import lombok.Data;
import nickle.javaInjava.struct.attributes.stackmaptable.variableinfo.VerificationTypeInfo;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class SameLocals1StackItemFrame {
    private byte frameType;
    private VerificationTypeInfo verificationTypeInfo;
}
