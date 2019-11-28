package nickle.javaInjava.struct;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import lombok.Builder;
import lombok.Data;
import nickle.javaInjava.parser.ClassFileEvent;
import nickle.javaInjava.parser.ClassFileParser;
import nickle.javaInjava.parser.Event;
import nickle.javaInjava.struct.constantpool.CPInfo;
import nickle.javaInjava.struct.constantpool.ConstantPool;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

/**
 * Created by button on 11/22/2019.
 */
@Data
public class ClassFile extends ClassFileEvent {
    {
        u4hex("magic");
        u2("minorVersion");
        u2("majorVersion");
        u2("constantPoolCount");
        add("constantPoolCount",new ConstantPool());
    }
    private int magic;
    private short minorVersion;
    private short majorVersion;
    private short constantPoolCount;
    private CPInfo[] constantPool;
    private short accessFlags;
    private short thisClass;
    private short superClass;
    private short interfacesCount;
    private short[] interfaces;
    private short fieldsCount;
    private FieldInfo[] fields;
    private short methodsCount;
    private MethodInfo[] methods;
    private short attributesCount;
    private AttributeInfo[] attributes;

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "E:\\work\\workspace\\JavaInJava\\target\\test-classes\\nickle\\javaInjava\\TestClass.class";
        FileInputStream inputStream = new FileInputStream(fileName);
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        ClassFileParser classFileParser = new ClassFileParser();
        ClassFile classFile = classFileParser.parse(dataInputStream);
        System.out.println(classFile);
    }
}
