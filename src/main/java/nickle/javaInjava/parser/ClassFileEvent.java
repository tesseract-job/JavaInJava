package nickle.javaInjava.parser;

import nickle.javaInjava.struct.ClassFile;
import nickle.javaInjava.struct.constantpool.CPInfo;
import nickle.javaInjava.struct.constantpool.ConstantPool;

import java.util.List;
import java.util.function.Function;

/**
 * @Description
 * @Author lixiao
 * @Data 2019/11/28 15:55
 * @Version 1.0
 **/
public class ClassFileEvent extends Event {

    protected static final Function<ClassFileReader, Byte> READ_U1 = ClassFileReader::readByte;
    protected static final Function<ClassFileReader, Short> READ_U2 = ClassFileReader::readShort;
    protected static final Function<ClassFileReader, Integer> READ_U4 = ClassFileReader::readInt;

    protected Class<ClassFile> classType = ClassFile.class;

    public void read(ClassFile classFile, ClassFileReader classFileReader,int currentEventIndex){
        List<Event> events = getEvents();
        for (int i = 0, size = events.size(); i< size;i++) {
            Event event = events.get(i);
            ((ClassFileEvent)event).read(classFile,classFileReader,i);
        }
    }

    protected final void u2(String eventName){
        addEvent(new U2(eventName));
    }

    protected final void u4hex(String name) {
        super.addEvent(new U4Hex(name));
    }
}
