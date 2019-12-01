package nickle.javaInjava.parser;

import java.io.IOException;

/**
 * @Description
 * @Author lixiao
 * @Data 2019/11/28 14:07
 * @Vercion 1.0
 **/
public interface Reader {
    byte readByte() throws IOException;
    int readByteUnsigned() throws IOException;
    short readShort() throws IOException;
    int readShortUnsigned() throws IOException;
    int readInt() throws IOException;
    long readIntUnsigned() throws IOException;
    long readLong() throws IOException;
    String readLongUnsigned() throws IOException;
    byte[] readBytes(int length) throws IOException;
}
