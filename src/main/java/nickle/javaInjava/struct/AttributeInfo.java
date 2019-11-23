package nickle.javaInjava.struct;

import lombok.Data;

/**
 * Created by button on 11/22/2019.
 */
@Data
public class AttributeInfo {
    short attributeNameIndex;
    int attributeLength;
    byte info[];
}
