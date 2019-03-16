package predicate;

import java.util.function.Predicate;

/**
 * @author: fanbopeng
 * @Date: 2019/3/16 15:21
 * @Description: 数据类型
 */
public class PredicateDemo1 {


    public static void main(String[] args) {

        boolean aa = method((String  c) -> {
            return  c=="a";

        }, "aa");

        System.out.println(aa);

    }


    public static  boolean method(Predicate<String> predicate,String abc){
        //数据类型进行判断的方法
        return   predicate.test(abc);

    }

}
