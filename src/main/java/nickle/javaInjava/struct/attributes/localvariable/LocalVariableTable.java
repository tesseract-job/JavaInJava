package nickle.javaInjava.struct.attributes.localvariable;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class LocalVariableTable {
    private short startPC;
    private short length;
    private short nameIndex;
    private short descriptorIndex;
    private short index;
}
