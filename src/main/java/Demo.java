/**
 * @author: fanbopeng
 * @Date: 2019/3/16 13:46
 * @Description:
 */
public class Demo {


   public static void show(MyFunctionalInterface myInt){


       myInt.print();
   }

    public static void main(String[] args) {


       show(new MyFunctionalInterface() {
           @Override
           public void print() {
               System.out.println("aaa");
           }
       });

        show(() ->{

            System.out.println(1);
        });

    }



}
