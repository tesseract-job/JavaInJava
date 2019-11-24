package nickle.javaInjava.struct.attributes.bootstrapmethods;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class BootstrapMethodsAttribute {
    private short attributeNameIndex;
    private int attributeLength;
    private short numBootstrapMethods;
    private BootstrapMethods[] bootstrapMethods;
}
