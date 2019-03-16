package function;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author: fanbopeng
 * @Date: 2019/3/16 15:32
 * @Description:
 */
public class FunctionDemo1 {


    public static void change(String s, Function<String,Integer> function){

        Integer apply = function.apply(s);
        System.out.println(apply);


    }


    public static void main(String[] args) {

        change("1", (s)->{
            return Integer.parseInt("1");


        });

        String a="[0,5]";
        String[] split1 = a.split(",");
        System.out.println(Arrays.toString(split1));



    }

}
