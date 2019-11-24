package nickle.javaInjava.struct.constantpool;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class ConstantMethodHandleInfo {
    private byte tag;
    private byte referencekind;
    private short referenceIndex;
}
