package lambda;

/**
 * @author: fanbopeng
 * @Date: 2019/3/16 14:03
 * @Description:
 */
public class LoggerDemo2 {


    public static void showLog(int lev,MessageBuilder mes){

        if (lev==1){

            System.out.println(mes.builderMessage());
        }


    }

    public static void main(String[] args) {
        String mes1="hello";
        String mes2="word";
        String mes3="java";

        showLog(1, ()->{

          //返回一个拼接好的字符串
            return  mes1+mes2+mes3;
        })   ;


    }

    //使用lamba表达式作为参数传递,仅仅是把参数传递到showLog方法中
    //只有前者参数满足条件才会进行字符串的拼接
}
