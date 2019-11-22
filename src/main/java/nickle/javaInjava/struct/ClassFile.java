package nickle.javaInjava.struct;

/**
 * Created by button on 11/22/2019.
 */
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

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public short getMinorVersion() {
        return minorVersion;
    }

    public void setMinorVersion(short minorVersion) {
        this.minorVersion = minorVersion;
    }

    public short getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(short majorVersion) {
        this.majorVersion = majorVersion;
    }

    public short getConstantPoolCount() {
        return constantPoolCount;
    }

    public void setConstantPoolCount(short constantPoolCount) {
        this.constantPoolCount = constantPoolCount;
    }

    public CPInfo[] getConstantPool() {
        return constantPool;
    }

    public void setConstantPool(CPInfo[] constantPool) {
        this.constantPool = constantPool;
    }

    public short getAccessFlags() {
        return accessFlags;
    }

    public void setAccessFlags(short accessFlags) {
        this.accessFlags = accessFlags;
    }

    public short getThisClass() {
        return thisClass;
    }

    public void setThisClass(short thisClass) {
        this.thisClass = thisClass;
    }

    public short getSuperClass() {
        return superClass;
    }

    public void setSuperClass(short superClass) {
        this.superClass = superClass;
    }

    public short getInterfacesCount() {
        return interfacesCount;
    }

    public void setInterfacesCount(short interfacesCount) {
        this.interfacesCount = interfacesCount;
    }

    public short[] getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(short[] interfaces) {
        this.interfaces = interfaces;
    }

    public short getFieldsCount() {
        return fieldsCount;
    }

    public void setFieldsCount(short fieldsCount) {
        this.fieldsCount = fieldsCount;
    }

    public FieldInfo[] getFields() {
        return fields;
    }

    public void setFields(FieldInfo[] fields) {
        this.fields = fields;
    }

    public short getMethodsCount() {
        return methodsCount;
    }

    public void setMethodsCount(short methodsCount) {
        this.methodsCount = methodsCount;
    }

    public MethodInfo[] getMethods() {
        return methods;
    }

    public void setMethods(MethodInfo[] methods) {
        this.methods = methods;
    }

    public short getAttributesCount() {
        return attributesCount;
    }

    public void setAttributesCount(short attributesCount) {
        this.attributesCount = attributesCount;
    }

    public AttributeInfo[] getAttributes() {
        return attributes;
    }

    public void setAttributes(AttributeInfo[] attributes) {
        this.attributes = attributes;
    }
}
