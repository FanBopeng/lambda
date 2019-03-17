package methodrefrence;

/**
 * @author: fanbopeng
 * @Date: 2019/3/17 18:13
 * @Description:
 */
public class Demo1Printable {





    public static void priintString(PrintAble printAble){

        printAble.print("aaa");


    }


    public static void main(String[] args) {

        priintString((s) -> System.out.print(s));

        priintString(System.out::print);


    }


}
