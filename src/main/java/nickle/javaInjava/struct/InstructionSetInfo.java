package nickle.javaInjava.struct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class InstructionSetInfo {
    private static HashMap<Integer,String> instructionMap = new HashMap<>();
    private static final String PROPADDR = "properties/instructionSet.properties";

    public static void main(String[] args) {
    }

    static {
        InputStream in = null;
        BufferedReader br = null;
        try {
            in = InstructionSetInfo.class.getClassLoader().getResourceAsStream(PROPADDR);
            br = new BufferedReader(new InputStreamReader(in));
            String line;
            while((line=br.readLine()).length()!=0){
                if(!line.startsWith("#")){
                    String[] arr = line.split(",");
                    instructionMap.put(Integer.valueOf(arr[1]),arr[0]);
                    System.out.println(arr[0]+"-"+arr[1]+"-"+arr[2]);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                in.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /*instructionMap.put(50,"aaload");
        instructionMap.put(83,"aastore");
        instructionMap.put(1,"aconst_null");
        instructionMap.put(25,"aload");
        instructionMap.put(42,"aload_0");
        instructionMap.put(43,"aload_1");
        instructionMap.put(44,"aload_2");
        instructionMap.put(45,"aload_3");
        instructionMap.put(189,"anewarray");
        instructionMap.put(176,"areturn");
        instructionMap.put(190,"arraylength");
        instructionMap.put(58,"astore");
        instructionMap.put(75,"astore_0");
        instructionMap.put(76,"astore_1");
        instructionMap.put(77,"astore_2");
        instructionMap.put(78,"astore_3");
        instructionMap.put(191,"athrow");
        instructionMap.put(51,"baload");
        instructionMap.put(84,"bastore");
        instructionMap.put(16,"bipush");
        instructionMap.put(52,"caload");
        instructionMap.put(85,"castore");
        instructionMap.put(192,"checkcast");
        instructionMap.put(144,"d2f");
        instructionMap.put(142,"d2i");
        instructionMap.put(143,"d2l");
        instructionMap.put(99,"dadd");
        instructionMap.put(49,"daload");
        instructionMap.put(82,"dastore");

        instructionMap.put(152,"dcmpg");
        instructionMap.put(151,"dcmpl");
        instructionMap.put(14,"dconst_0");
        instructionMap.put(15,"dconst_1");
        instructionMap.put(111,"ddiv");
        instructionMap.put(24,"dload");
        instructionMap.put(38,"dload_0");
        instructionMap.put(39,"dload_1");
        instructionMap.put(40,"dload_2");
        instructionMap.put(41,"dload_3");
        instructionMap.put(107,"dmul");
        instructionMap.put(119,"dneg");
        instructionMap.put(115,"drem");*/
    }
}
