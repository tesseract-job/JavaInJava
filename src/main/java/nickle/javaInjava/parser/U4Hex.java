package nickle.javaInjava.parser;

/**
 * @Description
 * @Author lixiao
 * @Data 2019/11/28 16:42
 * @Version 1.0
 **/
public class U4Hex extends UInt {

    public U4Hex(String filedName) {
        super(READ_U4);
        setName(filedName);
    }

}
