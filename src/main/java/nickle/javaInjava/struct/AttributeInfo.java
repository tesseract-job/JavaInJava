package nickle.javaInjava.struct;

import lombok.Data;

/**
 * Created by button on 11/22/2019.
 */
@Data
public class AttributeInfo {
    private short attributeNameIndex;
    private int attributeLength;
    private byte info[];
}
