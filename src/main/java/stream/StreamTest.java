package stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: fanbopeng
 * @Date: 2019/3/17 18:03
 * @Description:
 */
public class StreamTest {


    public static void main(String[] args) {

        List<Person>  list =new ArrayList<>();

        for (int i = 0; i <10 ; i++) {

            Person person=new Person(i,"张三"+i);
            list.add(person);

        }

        list.stream().filter((person ->   person.age>2)).forEach(person -> System.out.println( ));




    }


}
