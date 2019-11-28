package nickle.javaInjava.parser;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Description
 * @Author lixiao
 * @Data 2019/11/28 15:26
 * @Version 1.0
 **/
public class ClassFileReader extends DataInputStreamReader {

    public ClassFileReader(DataInputStream dataInputStream) {
        super(dataInputStream);
    }

    public ClassFileReader(String fileName) throws FileNotFoundException {
        super(new DataInputStream(new FileInputStream(fileName)));
    }
}
