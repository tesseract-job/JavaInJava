package nickle.javaInjava.struct.attributes.localvariable;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class LocalVariableTableAttribute {
    private short attributeNameIndex;
    private int attributeLength;
    private short localVariableTableLength;
    private LocalVariableTable[] localVariableTables;
}
