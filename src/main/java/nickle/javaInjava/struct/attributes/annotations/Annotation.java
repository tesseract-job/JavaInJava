package nickle.javaInjava.struct.attributes.annotations;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class Annotation {
    private short typeIndex;
    private short numElementValuePairs;
    private ElementValuePairs[] elementValuePairs;
}
