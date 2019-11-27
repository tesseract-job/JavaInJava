package nickle.javaInjava;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

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
        parseMagic(dataInputStream);
        parseMinorVersion(dataInputStream);
        parseMajorVersion(dataInputStream);
        short count = parseConstantPoolCount(dataInputStream);
        System.out.println(count);
        for (short i = 1; i < count; i++) {
            byte tag = parseOneByte(dataInputStream);
            switch (tag){
                case 10:
                    parseMethodRef(dataInputStream);
                    break;
                case 12:
                    parseType(dataInputStream);
                    break;
                case 7:
                    parseClass(dataInputStream);
                    break;
                case 1:
                    parseUTF8(dataInputStream);
                    break;
                case 9:
                    parseFieldRef(dataInputStream);
                    break;
            }
        }
        System.out.println(parseTwoByte(dataInputStream));
        System.out.println(parseTwoByte(dataInputStream));
        System.out.println(parseTwoByte(dataInputStream));
        System.out.println("interfaces_count:"+parseTwoByte(dataInputStream));
        System.out.println("fields_count:"+parseTwoByte(dataInputStream));
        System.out.println("fields_access_flags:"+parseTwoByte(dataInputStream));
        System.out.println("fields_name_index:"+parseTwoByte(dataInputStream));
        System.out.println("fields_descriptor_index:"+parseTwoByte(dataInputStream));
        System.out.println("fields_attributes_count:"+parseTwoByte(dataInputStream));
        System.out.println("methods_count:"+parseTwoByte(dataInputStream));
        parseMethodInfo(dataInputStream);
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

    private static void parseMethodRef(DataInputStream dataInputStream) throws IOException {
        System.out.println("method[tag:10,"+dataInputStream.readShort()+"-"+dataInputStream.readShort()+"]");
    }
    private static void parseFieldRef(DataInputStream dataInputStream) throws IOException {
        System.out.println("field[tag:9,"+dataInputStream.readShort()+"-"+dataInputStream.readShort()+"]");
    }
    private static void parseType(DataInputStream dataInputStream) throws IOException {
        System.out.println("type[tag:12,"+dataInputStream.readShort()+"-"+dataInputStream.readShort()+"]");
    }
    private static void parseClass(DataInputStream dataInputStream) throws IOException {
        System.out.println("class[tag:7,"+dataInputStream.readShort()+"]");
    }
    private static void parseUTF8(DataInputStream dataInputStream) throws IOException {

        short length = dataInputStream.readShort();
        StringBuffer sb = new StringBuffer();
        byte[] bytes = new byte[length];
        for (short i = 0; i < length; i++) {
            bytes[i] = dataInputStream.readByte();
        }
        System.out.println("utf8[tag:1,"+new String(bytes,"utf8")+"]");
    }
    private static int parseMagic(DataInputStream dataInputStream) throws IOException {
        return parseFourByte(dataInputStream);
    }
    private static short parseMinorVersion(DataInputStream dataInputStream) throws IOException {
        return parseTwoByte(dataInputStream);
    }
    private static short  parseMajorVersion(DataInputStream dataInputStream) throws IOException {
        return parseTwoByte(dataInputStream);
    }
    private static short parseConstantPoolCount(DataInputStream dataInputStream) throws IOException {
        return parseTwoByte(dataInputStream);
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
