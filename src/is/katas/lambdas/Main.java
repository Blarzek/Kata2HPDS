package is.katas.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Juan", 39));
        persons.add(new Person("Pedro", 30));
        persons.add(new Person("Elena", 25));
        persons.add(new Person("Abian", 49));
        persons.add(new Person("Luis", 15));

        Person eldestPerson = persons.stream().max(byAge()).get();
        Person youngestPerson = persons.stream().min(byAge()).get();

        List<Integer> list = persons.parallelStream().map(person -> person.age()).filter(person -> person < 40).collect(toList());
        double value = persons.parallelStream().mapToInt(Person::age).average().getAsDouble();

        System.out.println(eldestPerson.name());
        System.out.println(youngestPerson.name());
    }

    private static Comparator<Person> byAge() {
        return (o1, o2) -> o1.age() - o2.age();
    }
}
