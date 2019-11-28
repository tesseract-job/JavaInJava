package nickle.javaInjava.parser;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author lixiao
 * @Data 2019/11/28 15:48
 * @Version 1.0
 **/

public class Event {

    private String name;

    private List<Event> events;

    protected final void addEvent(Event event){

        if(events == null){
            events = new ArrayList<>();
        }
        events.add(event);
    }

    protected void add(String eventName, Event event){
        event.setName(eventName);
        this.addEvent(event);
    }
    public List<Event> getEvents() {
        return events;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
