package nickle.javaInjava.struct.attributes.exceptions;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class ExceptionTable {
    private short handlerPC;
    private short startPC;
    private short endPC;
    private short catchType;
}
