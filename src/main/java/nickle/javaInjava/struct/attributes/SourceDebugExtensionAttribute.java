package nickle.javaInjava.struct.attributes;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class SourceDebugExtensionAttribute {
    private short attributeNameIndex;
    private int attributeLength;
    private byte debugExtension;
}
