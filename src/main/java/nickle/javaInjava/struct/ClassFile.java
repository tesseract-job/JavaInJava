package nickle.javaInjava.struct;

import lombok.Data;

/**
 * Created by button on 11/22/2019.
 */
@Data
public class ClassFile {

    int magic;
    short minorVersion;
    short majorVersion;
    short constantPoolCount;
    CPInfo constantPool[];
    short accessFlags;
    short thisClass;
    short superClass;
    short interfacesCount;
    short interfaces[];
    short fieldsCount;
    FieldInfo fields[];
    short methodsCount;
    MethodInfo methods[];
    short attributesCount;
    AttributeInfo attributes[];
}
