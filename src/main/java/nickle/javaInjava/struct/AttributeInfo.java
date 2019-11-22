package nickle.javaInjava.struct;

/**
 * Created by button on 11/22/2019.
 */
public class AttributeInfo {
    short attribute_name_index;
    int attribute_length;
    byte info[];

    public short getAttribute_name_index() {
        return attribute_name_index;
    }

    public void setAttribute_name_index(short attribute_name_index) {
        this.attribute_name_index = attribute_name_index;
    }

    public int getAttribute_length() {
        return attribute_length;
    }

    public void setAttribute_length(int attribute_length) {
        this.attribute_length = attribute_length;
    }

    public byte[] getInfo() {
        return info;
    }

    public void setInfo(byte[] info) {
        this.info = info;
    }
}
