package stream;

import java.util.stream.Stream;

/**
 * @author: fanbopeng
 * @Date: 2019/3/17 17:25
 * @Description: forEach方法 用来遍历流中数据,  终结方法
 */
public class StreamDemo2 {

    public static void main(String[] args) {

      Stream.of("刘华强", "流向", "刘强东").forEach((name)->{

          System.out.println(name);
      })    ;

        Stream.of("刘华强", "流向", "刘强东").filter((name) ->{
          return    name.startsWith("刘");
        }).forEach((name)->{

            System.out.println(name);
        });


    }

}
