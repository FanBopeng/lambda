package lambda;

/**
 * @author: fanbopeng
 * @Date: 2019/3/16 14:11
 * @Description:
 */
public class RunableDemo {

    public static void main(String[] args) {

        new Thread(()-> System.out.println(123)).start();

    }

}
