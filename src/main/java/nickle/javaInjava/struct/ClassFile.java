package nickle.javaInjava.struct;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by button on 11/22/2019.
 */
@Data
public class ClassFile {

    private int magic;
    private short minorVersion;
    private short majorVersion;
    private short constantPoolCount;
    private Map<String, CPInfo> constantPool = new LinkedHashMap<String, CPInfo>();
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
}
