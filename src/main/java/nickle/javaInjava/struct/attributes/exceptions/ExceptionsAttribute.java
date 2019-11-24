package nickle.javaInjava.struct.attributes.exceptions;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class ExceptionsAttribute {
    private short attributeNameIndex;
    private int attributeLength;
    private short numberOfExceptions;
    private short[] exceptionIndexTable;
}
