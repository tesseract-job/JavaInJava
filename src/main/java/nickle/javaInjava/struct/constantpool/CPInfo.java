package nickle.javaInjava.struct.constantpool;

import lombok.Data;
import nickle.javaInjava.parser.ClassFileEvent;
import nickle.javaInjava.parser.ClassFileReader;
import nickle.javaInjava.parser.Event;

/**
 * @author button
 * @date 11/22/2019
 */
@Data
public abstract class CPInfo extends ClassFileEvent {


    private byte tag;
    private String typeDes;


    public void tag(byte tag){
        this.tag = tag;
    }

   /* protected abstract CPInfo fillConstantInfo(CPInfo cpInfo);*/
}
