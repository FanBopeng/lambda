package stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author: fanbopeng
 * @Date: 2019/3/17 16:59
 * @Description:
 */
public class StreamDemo1 {

    public static void main(String[] args) {


        List<String> list = Arrays.asList("张三", "王五", "六七");

            //延迟方法
        list.stream().filter(name->name.startsWith("张")).filter(name->name.endsWith("三"))
                .forEach(name-> System.out.println(name));
        Set<String> set=new HashSet<>();
        for (int i = 0; i <10 ; i++) {
            set.add("张三"+i);
        }

        Map<String,String> map =new HashMap<>();

        Set<String> mapKey = map.keySet();
        Stream<String> mapKeyStream = mapKey.stream();

        Collection<String> mapValue = map.values();
        Stream<String> mapValueStream = mapValue.stream();

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream = entries.stream();

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);



    }



}
