package stream;

/**
 * @author: fanbopeng
 * @Date: 2019/3/17 18:03
 * @Description:
 */
public class Person {

    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
