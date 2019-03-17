package methodrefrence;

/**
 * @author: fanbopeng
 * @Date: 2019/3/17 18:20
 * @Description:
 */
public class Test {

   public static void print(PrintAble p){

       p.print("hell");
   }


    public static void main(String[] args) {

       print(s->new MethodRefrenceObject().printUp(s));

       print(new MethodRefrenceObject()::printUp);
       print(MethodRefrenceObject::printUpStatic);
    }

}
