import java.util.Arrays;

public class Main {
    static class Person {
        String name;
        int age;

        Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Person[] p = { new Person("Geek1", 10),
                new Person("Geek2", 20),
                new Person("Geek3", 30),
                new Person("Geek4", 40),
                new Person("Geek5", 50),
                new Person("Geek6", 60), };
        Arrays.parallelPrefix(p, (e1, e2) ->
                new Person(e1.name.toUpperCase().concat(e2.name),
                        e1.age + e2.age));
        System.out.println("\nExample 1 :");

        Arrays.stream(p).forEach(e -> System.out.println(e.name + "   " + e.age));


// 2
        Person[] p1 = { new Person("Geek1", 10),
                new Person("Geek2", 20),
                new Person("Geek3", 30),
                new Person("Geek4", 40),
                new Person("Geek5", 50),
                new Person("Geek6", 60), };

        Arrays.parallelPrefix(p1, 1, 4, (e1, e2) ->
                new Person(e1.name.toUpperCase().concat(e2.name),
                        e1.age + e2.age));
        System.out.println("\nExample 2 :");

        Arrays.stream(p1).forEach(e -> System.out.println(e.name + "   " + e.age));
    }
}