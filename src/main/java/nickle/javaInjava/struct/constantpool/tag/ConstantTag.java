package nickle.javaInjava.struct.constantpool.tag;

/**
 * @Description 常量池常量类型
 * @Author lixiao
 * @Data 2019/11/28 10:52
 * @Vercion 1.0
 **/
public enum ConstantTag {
    UTF8((byte) 1),
    INTEGER((byte) 3),
    FLOAT((byte) 4),
    LONG((byte) 5),
    DOUBLE((byte) 6),
    CLASS((byte) 7),
    STRING((byte) 8),
    FIELD_REF((byte) 9),
    METHOD_REF((byte) 10),
    INTERFACE_METHODREF((byte) 11),
    NAME_AND_TYPE((byte) 12),
    METHOD_HANDLE((byte) 15),
    METHOD_TYPE((byte) 16),
    INVOKE_DYNAMIC((byte) 18);

    ConstantTag(byte tag){
        this.tag = tag;
    }
    private byte tag;

    public byte tag(){
        return this.tag;
    }
}
