package nickle.javaInjava;

import nickle.javaInjava.struct.*;
import nickle.javaInjava.struct.constantpool.*;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: LXSpringBoot
 * @description: 文件解析
 * @author: lixiao
 * @create: 2019-11-24 14:48
 **/
public class FileParser {
    
    
    public static void main(String[] args) throws IOException {
        //String fileName = "D:\\study\\LXSpringBoot\\out\\production\\classes\\com\\lx\\study\\Test1.class";
        String fileName = "E:\\work\\workspace\\JavaInJava\\target\\test-classes\\nickle\\javaInjava\\TestClass.class";
        FileInputStream inputStream = getInputStream(fileName);
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        ClassFile classFile = ClassFile.builder().build();
        parseMagic(dataInputStream,classFile);
        parseMinorVersion(dataInputStream,classFile);
        parseMajorVersion(dataInputStream,classFile);
        parseConstantCount(dataInputStream,classFile);
        getConstantPool(dataInputStream,classFile);
        parseAccessFlags(dataInputStream,classFile);
        parseThisClass(dataInputStream,classFile);
        parseSuperClass(dataInputStream,classFile);
        parseInterfacesCount(dataInputStream,classFile);
        parseInterfaces(dataInputStream,classFile);
        parseFieldsCount(dataInputStream,classFile);
        parseFields(dataInputStream,classFile);
        parseMethodsCount(dataInputStream,classFile);
        parseMethods(dataInputStream,classFile);
        /* parseAttributesCount(dataInputStream,classFile);
        parseAttributes(dataInputStream,classFile);*/
        System.out.println(classFile);
    }
    private static void getConstantPool(DataInputStream dataInputStream, ClassFile classFile) throws IOException {
        short constantPoolCount = classFile.getConstantPoolCount();
        LinkedHashMap<Integer, CPInfo> constantPool = new LinkedHashMap<>(constantPoolCount);
        for (short i = 1; i < constantPoolCount; i++) {
            byte tag = parseOneByte(dataInputStream);
            constantPool.put((int)i,parseConstantByTag(tag,dataInputStream));
        }
        classFile.setConstantPool(constantPool);
    }
    private static void parseConstantCount(DataInputStream dataInputStream, ClassFile classFile) throws IOException {
        classFile.setConstantPoolCount(parseTwoByte(dataInputStream));
    }
    private static CPInfo parseConstantByTag(byte tag, DataInputStream dataInputStream) throws IOException {
        switch (tag){
            case 10:
                return parseMethodRef(tag,dataInputStream);
            case 12:
                return parseType(tag,dataInputStream);
            case 7:
                return parseClass(tag,dataInputStream);
            case 1:
                return parseUTF8(tag,dataInputStream);
            case 9:
                return parseFieldRef(tag,dataInputStream);
            default:
                return null;
        }
    }

    private static void parseMethodInfo(DataInputStream dataInputStream) throws IOException {
        System.out.println("accesssFlags:"+dataInputStream.readShort());
        System.out.println("nameIndex:"+dataInputStream.readShort());
        System.out.println("descriptorIndex:"+dataInputStream.readShort());
        System.out.println("attributesCount:"+dataInputStream.readShort());
        System.out.println("attributeNameIndex:"+dataInputStream.readShort());

        System.out.println("attributeLength:"+dataInputStream.readLong());
        System.out.println("maxStack:"+dataInputStream.readShort());
        System.out.println("maxLocals:"+dataInputStream.readShort());
        /*StringBuilder sb =new StringBuilder("methodInfo[accesssFlags:"+dataInputStream.readShort()+
                ",nameIndex:"+dataInputStream.readShort()+
                ",descriptorIndex:"+dataInputStream.readShort()+
                ",attributesCount:");
        short i = dataInputStream.readShort();
        sb.append(i);
        sb.append("\n");
        sb.append(",attributes[");
        sb.append("\n");
        System.out.println(sb.toString());
        for (short j = 0; j < i; j++) {
            short attributeNameIndex = dataInputStream.readShort();
            sb.append("attributeNameIndex:").append(attributeNameIndex);
            long attributeLength = dataInputStream.readLong();
            sb.append("attributeLength:").append(attributeLength);
            System.out.println("maxStack:"+dataInputStream.readShort());
            System.out.println("maxLocals:"+dataInputStream.readShort());
            long codeLength = dataInputStream.readLong();
            System.out.println("codeLength:"+codeLength);

            for (long k = 0; k < codeLength; k++) {
                System.out.println(dataInputStream.readByte());
                if(k ==10){
                    break;
                }
            }
            System.out.println(dataInputStream.readByte());
            System.out.println(dataInputStream.readShort());
            //sb.append("info:").append(new String(bytes,"utf8"));
            sb.append("\n");
        }
        sb.append("]");
        System.out.println(sb.toString());*/
    }
    private static FileInputStream getInputStream(String fileName){
        try {
            return new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    private static CPInfo<ConstantMethodRefInfo> parseMethodRef(byte tag, DataInputStream dataInputStream) throws IOException {

        ConstantMethodRefInfo constantMethodRefInfo = ConstantMethodRefInfo.builder()
                .tag(tag)
                .classIndex(parseTwoByte(dataInputStream))
                .nameAndTypeIndex(parseTwoByte(dataInputStream))
                .build();

        CPInfo<ConstantMethodRefInfo> cpInfo = new CPInfo<>();
        cpInfo.setTag(tag);
        cpInfo.setInfo(constantMethodRefInfo);

        return cpInfo;
    }
    private static CPInfo<ConstantFieldRefInfo> parseFieldRef(byte tag, DataInputStream dataInputStream) throws IOException {

        ConstantFieldRefInfo constantFieldRefInfo = ConstantFieldRefInfo.builder()
                .tag(tag)
                .classIndex(parseTwoByte(dataInputStream))
                .nameAndTypeIndex(parseTwoByte(dataInputStream))
                .build();

        CPInfo<ConstantFieldRefInfo> cpInfo = new CPInfo<>();
        cpInfo.setTag(tag);
        cpInfo.setInfo(constantFieldRefInfo);

       return cpInfo;
    }
    private static CPInfo<ConstantNameAndTypeInfo> parseType(byte tag, DataInputStream dataInputStream) throws IOException {

        ConstantNameAndTypeInfo constantNameAndTypeInfo = ConstantNameAndTypeInfo.builder()
                .tag(tag)
                .nameIndex(parseTwoByte(dataInputStream))
                .descriptorIndex(parseTwoByte(dataInputStream))
                .build();

        CPInfo<ConstantNameAndTypeInfo> cpInfo = new CPInfo<>();
        cpInfo.setTag(tag);
        cpInfo.setInfo(constantNameAndTypeInfo);

        return cpInfo;
    }
    private static CPInfo<ConstantClassInfo> parseClass(byte tag, DataInputStream dataInputStream) throws IOException {

        ConstantClassInfo constantClassInfo = ConstantClassInfo.builder()
                .tag(tag)
                .nameIndex(parseTwoByte(dataInputStream))
                .build();

        CPInfo<ConstantClassInfo> cpInfo = new CPInfo<>();
        cpInfo.setTag(tag);
        cpInfo.setInfo(constantClassInfo);

        return cpInfo;
    }
    private static CPInfo<ConstantUtf8Info> parseUTF8(byte tag, DataInputStream dataInputStream) throws IOException {
        short length = parseTwoByte(dataInputStream);
        byte[] bytes = new byte[length];
        for (short i = 0; i < length; i++) {
            bytes[i] = dataInputStream.readByte();
        }
        ConstantUtf8Info constantUtf8Info = ConstantUtf8Info.builder()
                .length(length)
                .bytes(bytes)
                .tag(tag)
                .build();

        CPInfo<ConstantUtf8Info> cpInfo = new CPInfo<>();
        cpInfo.setTag(tag);
        cpInfo.setInfo(constantUtf8Info);
        return cpInfo;
    }

    private static void parseMagic(DataInputStream dataInputStream, ClassFile classFile) throws IOException {
        classFile.setMagic(parseFourByte(dataInputStream));
    }

    private static void parseMinorVersion(DataInputStream dataInputStream, ClassFile classFile) throws IOException {
        classFile.setMinorVersion(parseTwoByte(dataInputStream));
    }

    private static void  parseMajorVersion(DataInputStream dataInputStream, ClassFile classFile) throws IOException {
        classFile.setMajorVersion(parseTwoByte(dataInputStream));
    }

    private static void parseAccessFlags(DataInputStream dataInputStream, ClassFile classFile) throws IOException {
        classFile.setAccessFlags(parseTwoByte(dataInputStream));
    }

    private static void parseThisClass(DataInputStream dataInputStream, ClassFile classFile) throws IOException {
        classFile.setThisClass(parseTwoByte(dataInputStream));
    }

    private static void parseSuperClass(DataInputStream dataInputStream, ClassFile classFile) throws IOException {
        classFile.setSuperClass(parseTwoByte(dataInputStream));
    }

    private static void parseInterfacesCount(DataInputStream dataInputStream, ClassFile classFile) throws IOException {
        classFile.setInterfacesCount(parseTwoByte(dataInputStream));
    }

    private static void parseInterfaces(DataInputStream dataInputStream, ClassFile classFile) throws IOException {
        if(classFile.getInterfacesCount() == 0){
            short[] shorts = new short[0];
            classFile.setInterfaces(shorts);
        }
        //TODO 解析接口
    }

    private static void parseFieldsCount(DataInputStream dataInputStream, ClassFile classFile) throws IOException {
        classFile.setFieldsCount(parseTwoByte(dataInputStream));
    }

    private static void parseFields(DataInputStream dataInputStream, ClassFile classFile) throws IOException {
        short fieldsCount = classFile.getFieldsCount();
        if(fieldsCount == 0){
            classFile.setFields(new FieldInfo[0]);
        }
        for (short i = 0; i < fieldsCount; i++) {
            System.out.println("字段"+i+"的access_flags："+parseTwoByte(dataInputStream));
            System.out.println("字段"+i+"的name_index："+parseTwoByte(dataInputStream));
            System.out.println("字段"+i+"的descriptor_index："+parseTwoByte(dataInputStream));
            System.out.println("字段"+i+"的attributes_count："+parseTwoByte(dataInputStream));
        }

    }

    private static void parseMethodsCount(DataInputStream dataInputStream, ClassFile classFile) throws IOException {
        classFile.setMethodsCount(parseTwoByte(dataInputStream));
    }

    private static void parseMethods(DataInputStream dataInputStream, ClassFile classFile) throws IOException {
        short methodsCount = classFile.getMethodsCount();
        if(methodsCount == 0){
            classFile.setMethods(new MethodInfo[0]);
        }
        System.out.println("--------------------------------方法--------------------------------");
        for (short i = 0; i < methodsCount; i++) {
            System.out.println("方法"+i+"的access_flags："+parseTwoByte(dataInputStream));
            System.out.println("方法"+i+"的name_index："+parseTwoByte(dataInputStream));
            System.out.println("方法"+i+"的descriptor_index："+parseTwoByte(dataInputStream));
            short attributesCount = parseTwoByte(dataInputStream);
            System.out.println("方法"+i+"的attributes_count："+attributesCount);
            if(attributesCount > 0){
                for (short j = 0; j < attributesCount; j++) {
                    System.out.println("方法"+i+"的第"+j+"的属性的attribute_name_index："+parseTwoByte(dataInputStream));
                    System.out.println("方法"+i+"的第"+j+"的属性的attribute_length ："+parseFourByte(dataInputStream));
                    System.out.println("方法"+i+"的第"+j+"的属性的max_stack  ："+parseTwoByte(dataInputStream));
                    System.out.println("方法"+i+"的第"+j+"的属性的max_locals ："+parseTwoByte(dataInputStream));
                    long codeLength = parseFourByte(dataInputStream);
                    System.out.println("方法"+i+"的第"+j+"的属性的code_length  ："+codeLength);
                    if(codeLength > 0){
                        for (long k = 0; k < codeLength; k++) {
                            System.out.println("第"+k+"个指令："+Byte.toUnsignedInt(dataInputStream.readByte()));
                        }

                    }
                    System.out.println("方法"+i+"的第"+j+"的属性的exception_table_length："+parseTwoByte(dataInputStream));
                    System.out.println("方法"+i+"的第"+j+"的属性的account："+parseTwoByte(dataInputStream));
                    System.out.println("方法"+i+"的第"+j+"的属性的exception_table_length："+parseTwoByte(dataInputStream));
                    System.out.println("方法"+i+"的第"+j+"的属性的exception_table_length："+parseFourByte(dataInputStream));
                    System.out.println("方法"+i+"的第"+j+"的属性的exception_table_length："+parseTwoByte(dataInputStream));
                    System.out.println("方法"+i+"的第"+j+"的属性的startpc："+parseTwoByte(dataInputStream));
                    System.out.println("方法"+i+"的第"+j+"的属性的line："+parseTwoByte(dataInputStream));
                    System.out.println("方法"+i+"的第"+j+"的属性的line："+parseTwoByte(dataInputStream));
                    System.out.println("方法"+i+"的第"+j+"的属性的line："+parseFourByte(dataInputStream));
                    System.out.println("方法"+i+"的第"+j+"的属性的line："+parseTwoByte(dataInputStream));
                    break;
                }
            }
            break;
        }
        //TODO 解析方法
    }

    private static void parseAttributesCount(DataInputStream dataInputStream, ClassFile classFile) throws IOException {
        classFile.setAttributesCount(parseTwoByte(dataInputStream));
    }

    private static void parseAttributes(DataInputStream dataInputStream, ClassFile classFile) throws IOException {
        if(classFile.getAttributesCount() == 0){
            classFile.setAttributes(new AttributeInfo[0]);
        }
        //TODO 解析属性
    }

    private static byte parseOneByte(DataInputStream dataInputStream) throws IOException {
        return dataInputStream.readByte();
    }

    private static short parseTwoByte(DataInputStream dataInputStream) throws IOException {
        return dataInputStream.readShort();
    }

    private static int parseFourByte(DataInputStream dataInputStream) throws IOException {
        return dataInputStream.readInt();
    }

    private static long parseEightByte(DataInputStream dataInputStream) throws IOException {
        return dataInputStream.readLong();
    }

}
