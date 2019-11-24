package nickle.javaInjava.struct.attributes;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class ConstantValueAttribute {
    private short attributeNameIndex;
    private int attributeLength;
    private int constantvalueIndex;
}
