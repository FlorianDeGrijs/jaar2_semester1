package lambda;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaMain {

    private static Integer[] sort(Integer[] numbers) {
        Arrays.sort(numbers, Integer::compareTo);
        return numbers;
    }

    public static void main(String[] args) {
        Integer[] nums = {6,3,2,9,6,4,2,8};
        Comparator<Integer> sorted = Integer::compareTo;
        Arrays.sort(nums, sorted);
        System.out.println(Arrays.toString(nums));
        /*
        Person p1 = new Person("Kees", 25);
        Person p2 = new Person("Eee", 12);
        Person p3 = new Person("Koachae", 14);

        Animal a1 = new Animal("Giraffe");
        Animal a2 = new Animal("Horse");
        Animal a3 = new Animal("Cat");

        print(p3, p -> p.getName().contains("o"), p -> System.out.println(p.getName()));
        print(a1, p -> p.getName().contains("i"), p -> System.out.println(p.getName()));

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.stream().filter(p -> p.getName().contains("e")).map(p -> p.getName()+"XD").forEach(p -> System.out.println(p));

        print2(p1, p2, (person1, person2) -> person1.getName().equalsIgnoreCase(person2.getName()));
         */
    }

    private static void print2(Person person1, Person person2, BiPredicate<Person, Person> predicate) {
        if (predicate.test(person1, person2)) {
            System.out.println(person1.getName() + " == " + person2.getName());
        }
    }

    private static <T> void print(T type, Predicate<T> predicate, Consumer<T> consumer) {
        if (predicate.test(type)) {
            consumer.accept(type);
        }
    }
}
