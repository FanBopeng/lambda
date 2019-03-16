package supplier;

import java.util.function.Supplier;

/**
 * @author: fanbopeng
 * @Date: 2019/3/16 14:26
 * @Description:
 */
public class Demo02Supplier {

   public static int getMax(Supplier<Integer> supplier){


        return supplier.get();

   }

    public static void main(String[] args) {
        int[] arr={1,3,2,4,6};
        int res = getMax(() -> {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {

                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println(res);
    }


}
