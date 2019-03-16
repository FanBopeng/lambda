package comsumer;

import java.util.function.Consumer;

/**
 * @author: fanbopeng
 * @Date: 2019/3/16 14:41
 * @Description: and Then方法  可以有两个consumer接口组合在一起 ,再对数据消费
 *
 *
 */
public class ConsumerDemo2    {

     public static void method(String a, Consumer<String> con1,Consumer<String> con2){

         con1.andThen(con2).accept(a);



     }

    public static void main(String[] args) {

        System.out.println("hello".toUpperCase());


        method("hello", (str) ->{
             String s = str.toUpperCase();
             System.out.println(s);
         },(str2) ->{

             System.out.println(str2.toUpperCase());

         } );


    }


}
