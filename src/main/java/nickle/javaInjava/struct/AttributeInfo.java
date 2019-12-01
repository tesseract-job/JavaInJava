package nickle.javaInjava.struct;

import lombok.Data;
import nickle.javaInjava.parser.ClassFileEvent;

/**
 *
 * @author button
 * @date 11/22/2019
 */
@Data
public class AttributeInfo extends ClassFileEvent {
    {
        u2("attributeNameIndex");
        u4("attributeLength");
        array("info","attributeLength");
    }
    private short attributeNameIndex;
    private int attributeLength;
    private byte[] info;
}
