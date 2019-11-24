package nickle.javaInjava.struct.attributes.annotations;

import lombok.Data;
import nickle.javaInjava.struct.attributes.annotations.ElementValue;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class ArrayValue {
    private short num_values;
    private ElementValue values;
}
