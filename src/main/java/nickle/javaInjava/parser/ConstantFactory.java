package nickle.javaInjava.parser;

import nickle.javaInjava.struct.constantpool.*;

/**
 * @Description
 * @Author lixiao
 * @Data 2019/11/28 17:35
 * @Version 1.0
 **/
public class ConstantFactory {

    /**
     * Create concrete ConstantXxxInfo by tag.
     * @param tag
     * @return
     */
    public static CPInfo create(byte tag) {
        switch (tag) {
            case  1: return new ConstantUtf8Info();
            case  3: return new ConstantIntegerInfo();
            case  4: return new ConstantFloatInfo();
            case  5: return new ConstantLongInfo();
            case  6: return new ConstantDoubleInfo();
            case  7: return new ConstantClassInfo();
            case  8: return new ConstantStringInfo();
            case  9: return new ConstantFieldRefInfo();
            case 10: return new ConstantMethodRefInfo();
            case 11: return new ConstantInterfaceMethodRefInfo();
            case 12: return new ConstantNameAndTypeInfo();
            case 15: return new ConstantMethodHandleInfo();
            case 16: return new ConstantMethodTypeInfo();
            case 18: return new ConstantInvokeDynamicInfo();
        }

        throw new RuntimeException("Invalid Constant Type: " + tag);
    }

}
