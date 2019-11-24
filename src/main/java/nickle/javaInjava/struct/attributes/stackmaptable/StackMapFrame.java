package nickle.javaInjava.struct.attributes.stackmaptable;

import lombok.Data;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class StackMapFrame {
    private SameFrame sameFrame;
    private SameLocals1StackItemFrame sameLocals1StackItemFrame;
    private SameLocals1StackItemframeExtended sameLocals1StackItemframeExtended;
    private ChopFrame chopFrame;
    private SameFrameExtended sameFrameExtended;
    private AppendFrame appendFrame;
    private FullFrame fullFrame;
}
