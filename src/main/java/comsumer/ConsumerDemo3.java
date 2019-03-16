package comsumer;

import java.util.function.Consumer;

/**
 * @author: fanbopeng
 * @Date: 2019/3/16 15:08
 * @Description:
 */
public class ConsumerDemo3 {

    public static  void  method(String[] str, Consumer<String> con1,Consumer<String> con2){

        for (int i = 0; i < str.length; i++) {
            con1.andThen(con2).accept(str[i]);
        }

    }

    public static void main(String[] args) {

        String[] str={"张三,6","李四,5","王八,6"};

        method(str, (s1)->{
            System.out.println("姓名:"+s1.split(",")[0]);

        }, (s2)->{
            System.out.println("年龄"+s2.split(",")[1]);


        });



    }




}
