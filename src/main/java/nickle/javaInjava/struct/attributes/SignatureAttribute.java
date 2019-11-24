package nickle.javaInjava.struct.attributes;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class SignatureAttribute {
    private short attributeNameIndex;
    private int attributeLength;
    private short signatureIndex;
}
