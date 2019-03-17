package stream;

import java.util.stream.Stream;

/**
 * @author: fanbopeng
 * @Date: 2019/3/17 17:49
 * @Description:
 */
public class StreamCount {

    public static void main(String[] args) {

        System.out.println(Stream.of(false, true, false, true).count());


    }

}
