package nickle.javaInjava.struct;

import lombok.Data;

/**
 *
 * @author button
 * @date 11/22/2019
 */
@Data
public class FieldInfo {
    private short accessFlags;
    private short nameIndex;
    private short descriptorIndex;
    private short attributesCount;
    private AttributeInfo[] attributes;
}
