package lambda;

/**
 * @author: fanbopeng
 * @Date: 2019/3/16 13:52
 * @Description:  日志案例
 *
 *
 *
 *
 */
public class LoggerDemo {
    
    /**
     *
     * 功能描述: 
     *          根据日志级别显示日志方法
     * @param:
     * @return: 
     * @auther: fanbopeng
     * @date: 2019/3/16 13:52
     */

    public static void showLog(int lev,String mes){
        //如果lev等级不是1,后面的字符串拼接,就是性能浪费了
        //public static void showLog(int lev,String mes){
        if (lev==1){

            System.out.println(mes);
        }


    }

    public static void main(String[] args) {

        String mes1="hello";
        String mes2="word";
        String mes3="java";

        showLog(2, mes1+mes2+mes3);

    }
}
