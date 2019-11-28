package nickle.javaInjava.struct.constantpool;

import lombok.Data;
import nickle.javaInjava.parser.ClassFileEvent;
import nickle.javaInjava.parser.ClassFileReader;

/**
 * @author button
 * @date 11/22/2019
 */
@Data
public abstract class CPInfo extends ClassFileEvent {

    private byte tag;
    private String typeDes;

    public abstract void read(CPInfo cpInfo, ClassFileReader classFileReader,int currentEventIndex);

    public void tag(byte tag){
        this.tag = tag;
    }
}
