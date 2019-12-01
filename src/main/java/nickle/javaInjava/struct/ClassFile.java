package nickle.javaInjava.struct;

import lombok.Data;
import nickle.javaInjava.parser.ClassFileEvent;
import nickle.javaInjava.parser.ClassFileParser;
import nickle.javaInjava.struct.constantpool.CPInfo;
import nickle.javaInjava.struct.constantpool.ConstantPool;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

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
        add("constantPool",new ConstantPool());
        u2("accessFlags");
        u2("thisClass");
        u2("superClass");
        u2("interfacesCount");
        tableU2("interfaces");
        u2("fieldsCount");
        table("fields",FieldInfo.class);
        u2("methodsCount");
        table("methods",MethodInfo.class);
        u2("attributesCount");
        table("attributes",AttributeInfo.class);
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
    private Short[] interfaces;
    private short fieldsCount;
    private FieldInfo[] fields;
    private short methodsCount;
    private MethodInfo[] methods;
    private short attributesCount;
    private AttributeInfo[] attributes;

    public static void main(String[] args) throws IOException {
        String fileName = "D:\\study\\JavaInJava\\target\\test-classes\\nickle\\javaInjava\\TestClass.class";
        FileInputStream inputStream = new FileInputStream(fileName);
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        ClassFileParser classFileParser = new ClassFileParser();
        ClassFile classFile = classFileParser.parse(dataInputStream);
        System.out.println(Arrays.asList(classFile.getConstantPool()));
        System.out.println(classFile.toString());
        short i = dataInputStream.readShort();
        System.out.println(i);

    }
}
