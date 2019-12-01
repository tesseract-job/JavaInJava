package nickle.javaInjava.struct;

import lombok.Data;
import nickle.javaInjava.parser.ClassFileEvent;

/**
 *
 * @author button
 * @date 11/22/2019
 */
@Data
public class MethodInfo extends ClassFileEvent {

    {
        u2("accessFlags");
        u2("nameIndex");
        u2("descriptorIndex");
        u2("attributesCount");
        table("attributes",AttributeInfo.class);
    }
    private short accessFlags;
    private short nameIndex;
    private short descriptorIndex;
    private short attributesCount;
    private AttributeInfo[] attributes;
}
