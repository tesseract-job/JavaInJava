package nickle.javaInjava.parser;

import nickle.javaInjava.struct.ClassFile;

import java.io.DataInputStream;

/**
 * @Description
 * @Author lixiao
 * @Data 2019/11/28 15:29
 * @Version 1.0
 **/
public class ClassFileParser implements Parser<DataInputStream, ClassFile> {
    @Override
    public ClassFile parse(DataInputStream dataInputStream) {
        ClassFile classFile = new ClassFile();
        classFile.read(classFile,new ClassFileReader(dataInputStream),-1);
        return classFile;
    }
}
