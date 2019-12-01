package nickle.javaInjava.struct.constantpool;

import nickle.javaInjava.parser.ClassFileEvent;
import nickle.javaInjava.parser.ClassFileReader;
import nickle.javaInjava.parser.ConstantFactory;
import nickle.javaInjava.parser.Event;
import nickle.javaInjava.struct.ClassFile;

/**
 * @Description
 * @Author lixiao
 * @Data 2019/11/28 17:13
 * @Version 1.0
 **/
public class ConstantPool extends ClassFileEvent {
    private CPInfo[] constants;

    @Override
    public void read(Object object, ClassFileReader classFileReader) {
        ClassFile classFile = (ClassFile) object;
        short constantPoolCount = classFile.getConstantPoolCount();
        constants = new CPInfo[classFile.getConstantPoolCount()];
        for (short i = 1; i < constantPoolCount; i++) {
            constants[i] = readCPInfo(classFile,classFileReader);
        }
        classFile.setConstantPool(constants);
    }
    private CPInfo readCPInfo(Object object, ClassFileReader classFileReader){

        Byte tag = READ_U1.apply(classFileReader);
        CPInfo cpInfo = ConstantFactory.create(tag);
        cpInfo.setTag(tag);
        cpInfo.setTypeDes(cpInfo.getName());
        cpInfo.read(cpInfo,classFileReader);
        return cpInfo;
    }
}
