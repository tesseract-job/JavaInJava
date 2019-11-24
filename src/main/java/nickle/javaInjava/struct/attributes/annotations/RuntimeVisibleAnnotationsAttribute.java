package nickle.javaInjava.struct.attributes.annotations;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class RuntimeVisibleAnnotationsAttribute {
    private short attributeNameIndex;
    private int attributeLength;
    private short numAnnotations;
    private Annotation[] annotations;
}
