package nickle.javaInjava.struct;

/**
 * Created by button on 11/22/2019.
 */
public class CPInfo {
    byte tag;
    byte info[];

    public byte getTag() {
        return tag;
    }

    public void setTag(byte tag) {
        this.tag = tag;
    }

    public byte[] getInfo() {
        return info;
    }

    public void setInfo(byte[] info) {
        this.info = info;
    }
}
