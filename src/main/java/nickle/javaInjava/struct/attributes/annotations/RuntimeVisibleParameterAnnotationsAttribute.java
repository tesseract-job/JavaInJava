package nickle.javaInjava.struct.attributes.annotations;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class RuntimeVisibleParameterAnnotationsAttribute {
    private short attributeNameIndex;
    private int attributeLength;
    private byte numParameters;
    private ParameterAnnotation[] parameterAnnotations;
}
