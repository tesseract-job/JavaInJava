package nickle.javaInjava.struct.attributes.localvariable;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class LocalVariableTypeTableAttribute {
    private short attributeNameIndex;
    private int attributeLength;
    private short localVariableTypeTableLength;
    private LocalVariableTypeTable[] localVariableTypeTables;
}
