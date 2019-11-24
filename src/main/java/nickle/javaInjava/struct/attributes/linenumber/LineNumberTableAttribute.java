package nickle.javaInjava.struct.attributes.linenumber;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class LineNumberTableAttribute {
    private short attributeNameIndex;
    private int attributeLength;
    private short LineNumberTableLength;
    private LineNumberTable[] lineNumberTable;
}
