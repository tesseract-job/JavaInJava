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
    //protected static final Function<ClassFileReader, Byte[]> READ_Bytes = ClassFileReader::readBytes;

    public void read(Object obj, ClassFileReader classFileReader){
        List<Event> events = getEvents();
        for (int i = 0, size = events.size(); i< size;i++) {
            Event event = events.get(i);
            ((ClassFileEvent)event).read(obj,classFileReader);
        }
    }

    protected final void u2(String eventName){
        super.add(eventName,new U2());
    }
    protected final void u4(String eventName){
        super.add(eventName,new U4());
    }
    protected final void u1(String eventName){
        super.add(eventName,new U1());
    }
    protected final void u4hex(String name) {
        super.add(name,new U4Hex());
    }
    protected final void array(String name, String countFieldName) {
        super.add(name,new U1Arrays(countFieldName));
    }
    protected final void tableU2(String name) {
        super.add(name,new TableU2(Short.class));
    }
    protected final void table(String name, Class<?> claszz) {
        super.add(name,new CPInfoTable(claszz));
    }
}
