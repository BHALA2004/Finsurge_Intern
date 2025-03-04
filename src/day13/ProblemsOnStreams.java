package day13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Transaction{
    String date;
    int value;

    public Transaction(String date, int value) {
        this.date = date;
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ProblemsOnStreams {
    public static void main(String[] args) {
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");

        Optional<String> string = strings.stream().max(Comparator.comparingInt(s->s.length()));
        System.out.println(string);

        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        double k = persons.stream().mapToInt(p -> p.getAge()).average().orElse(0);
        System.out.println(k);

        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );

        System.out.println(transactions.stream().collect(Collectors.groupingBy(t -> t.getDate(),Collectors.summarizingInt(t->t.getValue()))));



    }
}
