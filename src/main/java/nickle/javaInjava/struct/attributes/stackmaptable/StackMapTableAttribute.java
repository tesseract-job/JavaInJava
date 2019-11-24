package nickle.javaInjava.struct.attributes.stackmaptable;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class StackMapTableAttribute {
    private short attributeNameIndex;
    private int attributeLength;
    private short  numberOfEntries;
    private StackMapFrame[] entries;
}
