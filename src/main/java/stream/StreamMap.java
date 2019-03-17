package stream;

import java.util.stream.Stream;

/**
 * @author: fanbopeng
 * @Date: 2019/3/17 17:45
 * @Description:
 */
public class StreamMap {


    public static void main(String[] args) {
        Stream.of("1", "2", "3").map((name)->{

         return     Integer.parseInt(name);
        }).forEach((name)->{

            System.out.println(name);
        });



    }
}
