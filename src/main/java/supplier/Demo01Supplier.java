package supplier;

import java.util.function.Supplier;

/**
 * @author: fanbopeng
 * @Date: 2019/3/16 14:26
 * @Description:
 */
public class Demo01Supplier {

    public static String getString(Supplier<String> sup){

        return sup.get();
    }

    public static void main(String[] args) {

        String aaaa = getString(() -> {

            return new String("aaaa");
        });

        System.out.println(aaaa);

        String res = getString(() -> new String("张三"));
        System.out.println(res);
    }

}
