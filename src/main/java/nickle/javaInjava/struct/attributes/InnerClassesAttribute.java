package nickle.javaInjava.struct.attributes;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class InnerClassesAttribute {
    private short attributeNameIndex;
    private int attributeLength;
    private short numberOfClasses;
    private Classes[] classes;

    class Classes{
        private short innerClassInfoIndex;
        private short outerClassInfoIndex;
        private short innerNameIndex;
        private short innerClassAccessFlags;
    }
}
