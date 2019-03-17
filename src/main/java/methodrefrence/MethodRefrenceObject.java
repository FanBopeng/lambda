package methodrefrence;

/**
 * @author: fanbopeng
 * @Date: 2019/3/17 18:19
 * @Description:
 */
public class MethodRefrenceObject extends  MethodRefrenceObjectBase {



    public void printUp(String str){

        System.out.println(str.toUpperCase());
    }

    public  static void printUpStatic(String str){

        System.out.println(str.toUpperCase());
    }
}
