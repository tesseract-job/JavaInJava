package nickle.javaInjava.struct.attributes.annotations;

import lombok.Data;
import nickle.javaInjava.struct.attributes.EnumConstValue;
import nickle.javaInjava.struct.attributes.annotations.Annotation;
import nickle.javaInjava.struct.attributes.annotations.ArrayValue;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class Value {
    private short constValueIndex;
    private EnumConstValue enumConstValue;
    private short classInfoIndex;
    private Annotation annotationValue;
    private ArrayValue arrayValue;
}
