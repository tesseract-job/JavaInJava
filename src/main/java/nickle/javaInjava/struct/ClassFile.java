package nickle.javaInjava.struct;

/**
 * Created by button on 11/22/2019.
 */
public class ClassFile {

    int magic;
    short minor_version;
    short major_version;
    short constant_pool_count;
    CPInfo constant_pool[];
    short access_flags;
    short this_class;
    short super_class;
    short interfaces_count;
    short interfaces[];
    short fields_count;
    FieldInfo fields[];
    short methods_count;
    MethodInfo methods[];
    short attributes_count;
    AttributeInfo attributes[];

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public short getMinor_version() {
        return minor_version;
    }

    public void setMinor_version(short minor_version) {
        this.minor_version = minor_version;
    }

    public short getMajor_version() {
        return major_version;
    }

    public void setMajor_version(short major_version) {
        this.major_version = major_version;
    }

    public short getConstant_pool_count() {
        return constant_pool_count;
    }

    public void setConstant_pool_count(short constant_pool_count) {
        this.constant_pool_count = constant_pool_count;
    }

    public CPInfo[] getConstant_pool() {
        return constant_pool;
    }

    public void setConstant_pool(CPInfo[] constant_pool) {
        this.constant_pool = constant_pool;
    }

    public short getAccess_flags() {
        return access_flags;
    }

    public void setAccess_flags(short access_flags) {
        this.access_flags = access_flags;
    }

    public short getThis_class() {
        return this_class;
    }

    public void setThis_class(short this_class) {
        this.this_class = this_class;
    }

    public short getSuper_class() {
        return super_class;
    }

    public void setSuper_class(short super_class) {
        this.super_class = super_class;
    }

    public short getInterfaces_count() {
        return interfaces_count;
    }

    public void setInterfaces_count(short interfaces_count) {
        this.interfaces_count = interfaces_count;
    }

    public short[] getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(short[] interfaces) {
        this.interfaces = interfaces;
    }

    public short getFields_count() {
        return fields_count;
    }

    public void setFields_count(short fields_count) {
        this.fields_count = fields_count;
    }

    public FieldInfo[] getFields() {
        return fields;
    }

    public void setFields(FieldInfo[] fields) {
        this.fields = fields;
    }

    public short getMethods_count() {
        return methods_count;
    }

    public void setMethods_count(short methods_count) {
        this.methods_count = methods_count;
    }

    public MethodInfo[] getMethods() {
        return methods;
    }

    public void setMethods(MethodInfo[] methods) {
        this.methods = methods;
    }

    public short getAttributes_count() {
        return attributes_count;
    }

    public void setAttributes_count(short attributes_count) {
        this.attributes_count = attributes_count;
    }

    public AttributeInfo[] getAttributes() {
        return attributes;
    }

    public void setAttributes(AttributeInfo[] attributes) {
        this.attributes = attributes;
    }
}
