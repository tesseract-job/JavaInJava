package nickle.javaInjava.struct.attributes.stackmaptable.variableinfo;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class VerificationTypeInfo {
    private TopVariableInfo topVariableInfo;
    private IntegerVariableInfo integerVariableInfo;
    private FloatVariableInfo floatVariableInfo;
    private LongVariableInfo longVariableInfo;
    private DoubleVariableInfo doubleVariableInfo;
    private NullVariableInfo nullVariableInfo;
    private UninitializedThisVariableInfo uninitializedThisVariableInfo;
    private ObjectVariableInfo objectVariableInfo;
    private UninitializedVariableInfo uninitializedVariableInfo;
}
