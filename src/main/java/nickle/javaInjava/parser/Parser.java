package nickle.javaInjava.parser;

/**
 * @Description 解析器
 * @Author lixiao
 * @Data 2019/11/28 8:34
 * @Vercion 1.0
 **/
public interface Parser<T,R> {
    R parse(T t);
}
