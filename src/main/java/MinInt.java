import java.util.stream.IntStream;

/**
 * @author: fanbopeng
 * @Date: 2019/3/14 12:00
 * @Description:
 */
public class MinInt {


    public static void main(String[] args) {

        int[] nums={20,30,14};

        int i = IntStream.of(nums).min().getAsInt();
        System.out.println(i);


    }

}
