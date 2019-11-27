package nickle.javaInjava;

import nickle.javaInjava.struct.MethodInfo;

import java.util.Stack;

/**
 * @Description 栈帧
 * @Author lixiao
 * @Data 2019/11/25 12:14
 * @Version 1.0
 **/
public class StackFrame {

    private Object[] localVariables;
    private Stack operandStack;
    private MethodInfo methodInfo;
}
