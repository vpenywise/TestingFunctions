package streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        Set<Gender> genderSet = new HashSet();
        for (Person people1 : people) {
            Gender gender = people1.gender;
            genderSet.add(gender);
        }
        genderSet.forEach(System.out::println);

        System.out.println();

        HashSet genderSet2 = new HashSet();
        for (Person people1 : people) {
            Gender gender = people1.gender;
            genderSet2.add(gender);
        }
        genderSet2.forEach(System.out::println);

        System.out.println();

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }

}
