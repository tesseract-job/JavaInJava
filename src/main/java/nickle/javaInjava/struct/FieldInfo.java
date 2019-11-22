package nickle.javaInjava.struct;

/**
 * Created by button on 11/22/2019.
 */
public class FieldInfo {
    short access_flags;
    short name_index;
    short descriptor_index;
    short attributes_count;
    AttributeInfo attributes[];

    public short getAccess_flags() {
        return access_flags;
    }

    public void setAccess_flags(short access_flags) {
        this.access_flags = access_flags;
    }

    public short getName_index() {
        return name_index;
    }

    public void setName_index(short name_index) {
        this.name_index = name_index;
    }

    public short getDescriptor_index() {
        return descriptor_index;
    }

    public void setDescriptor_index(short descriptor_index) {
        this.descriptor_index = descriptor_index;
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
