package nickle.javaInjava.struct;

import lombok.Data;

/**
 * Created by button on 11/22/2019.
 */
@Data
public class MethodInfo {
    short accessFlags;
    short nameIndex;
    short descriptorIndex;
    short attributesCount;
    AttributeInfo attributes[];
}
