package nickle.javaInjava.struct.constantpool;

import lombok.Data;

import java.io.UnsupportedEncodingException;

/**
 * Created by wesley on 2019/11/24.
 */
@Data
public class ConstantUtf8Info extends CPInfo{

    {
       u2("length");
       array("bytes","length");
    }
    private byte tag;
    private short length;
    private byte[] bytes;
    private String desc;

/*    public String getDesc() {
        try {
            return new String(this.bytes,"utf8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }*/
}
