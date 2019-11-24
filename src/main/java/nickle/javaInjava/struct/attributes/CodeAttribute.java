package nickle.javaInjava.struct.attributes;

import lombok.Data;
import nickle.javaInjava.struct.AttributeInfo;
import nickle.javaInjava.struct.attributes.exceptions.ExceptionTable;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class CodeAttribute {
    private short attributeNameIndex;
    private int attributeLength;
    private short maxStack;
    private short maxLocals;
    private int codeLength;
    private byte[] code;
    private short exceptionTableLength;
    private short attributesCount;
    private ExceptionTable[] exceptionTable;
    private AttributeInfo[] attributes;
}
