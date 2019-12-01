package nickle.javaInjava;

import java.io.Serializable;

/**
 * @program: LXSpringBoot
 * @description:
 * @author: lixiao
 * @create: 2019-11-26 23:40
 **/
public class TestClass implements Serializable,Cloneable {

    private int m;

    public int inc() {
        return m + 1;
    }
}
