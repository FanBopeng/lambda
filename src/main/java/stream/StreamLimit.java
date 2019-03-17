package stream;

import java.util.stream.Stream;

/**
 * @author: fanbopeng
 * @Date: 2019/3/17 17:53
 * @Description:
 */
public class StreamLimit {


    public static void main(String[] args) {

       Stream.of("zhangsan", "lisi").limit(1).forEach((name)->{

            System.out.println(name);
        });


        Stream.of("zhangsan", "lisi").skip(1).forEach((name)->{

            System.out.println(name);
        });

        Stream<String> stream1 = Stream.of("张三", "李四");
        Stream<String> stream2 = Stream.of("王五", "麻子六");
        Stream.concat(stream1,stream2 ).skip(2).forEach(a-> System.out.println(a));

    }

}
