package nickle.javaInjava.struct.constantpool;

import nickle.javaInjava.parser.ClassFileEvent;
import nickle.javaInjava.parser.ClassFileReader;
import nickle.javaInjava.parser.ConstantFactory;
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
    public void read(ClassFile classFile, ClassFileReader classFileReader,int currentEventIndex) {
        short constantPoolCount = classFile.getConstantPoolCount();
        if(constantPoolCount == 0){
            return;
        }
        constants = new CPInfo[constantPoolCount];
        for (short i = 1; i < constantPoolCount; i++) {
            constants[i] = getCPInfo(classFileReader,i);
        }
        classFile.setConstantPool(constants);
    }
    private CPInfo getCPInfo(ClassFileReader classFileReader,int currentEventIndex){
        byte tag = classFileReader.readByte();
        CPInfo cpInfo = ConstantFactory.create(tag);
        cpInfo.read(cpInfo,classFileReader,currentEventIndex);
        return cpInfo;
    }

}
