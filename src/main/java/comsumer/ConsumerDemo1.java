package comsumer;

import java.util.function.Consumer;

/**
 * @author: fanbopeng
 * @Date: 2019/3/16 14:36
 * @Description:
 */
public class ConsumerDemo1  {

    public static void  method(String name,Consumer<String> consumer){

    consumer.accept(name);

    }

    public static void main(String[] args) {

        method( "张三", (name)->{

           StringBuilder sb=new StringBuilder(name);
            System.out.println(sb.reverse().toString());
        });

    }


}
