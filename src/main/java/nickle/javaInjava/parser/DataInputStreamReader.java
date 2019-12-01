package nickle.javaInjava.parser;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * @Description
 * @Author lixiao
 * @Data 2019/11/28 14:27
 * @Version 1.0
 **/
public class DataInputStreamReader implements Reader {

    public DataInputStreamReader(DataInputStream dataInputStream){
        this.dataInputStream = dataInputStream;
    }

    private DataInputStream dataInputStream;


    @Override
    public byte readByte() {
        try {
            return dataInputStream.readByte();
        } catch (IOException e) {
            return 0;
        }
    }

    @Override
    public int readByteUnsigned() {
        return Byte.toUnsignedInt(readByte());
    }

    @Override
    public short readShort(){
        try {
            return dataInputStream.readShort();
        } catch (IOException e) {
            return 0;
        }
    }

    @Override
    public int readShortUnsigned(){
        return Short.toUnsignedInt(readShort());
    }

    @Override
    public int readInt(){
        try {
            return dataInputStream.readInt();
        } catch (IOException e) {
            return 0;
        }
    }

    @Override
    public long readIntUnsigned() throws IOException {
        return 0;
    }

    @Override
    public long readLong() throws IOException {
        return dataInputStream.readLong();
    }

    @Override
    public String readLongUnsigned() throws IOException {
        return null;
    }

    @Override
    public byte[] readBytes(int length) throws IOException {
        byte[] bytes = new byte[length];
        dataInputStream.read(bytes,0,length);
        return bytes;
    }
}
