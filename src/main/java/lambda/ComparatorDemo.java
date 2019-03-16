package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Supplier;

/**
 * @author: fanbopeng
 * @Date: 2019/3/16 14:15
 * @Description:
 */
public class ComparatorDemo {
        //定义一个方法,返回值类型使用函数式接口Comarator

    public static Comparator<String> getCompator(){

        return  new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };



    }
    public static Comparator<String> getCompatorLam(){

        return (String o1,String o2) ->{

           return   o1.length()-o2.length();

        };

    }
    public static Comparator<String> getCompatorLam2(){

        return ( o1, o2) ->

            o1.length()-o2.length();



    }

    public static void main(String[] args) {

        String[] ar ={"abc","aaaaaa","bcc","bbb"};

        System.out.println(Arrays.toString(ar));

        Arrays.sort(ar,getCompatorLam2());
        System.out.println(Arrays.toString(ar));

    }

}
