package nickle.javaInjava.struct;

import lombok.Builder;
import lombok.Data;

/**
 * @author button
 * @date 11/22/2019
 */
@Data
public class CPInfo<T> {
    private byte tag;
    private T info;
}
