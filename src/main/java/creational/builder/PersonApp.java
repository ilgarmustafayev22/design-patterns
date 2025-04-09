package creational.builder;

public class PersonApp {


    public static void main(String[] args) {

        Person person1 = new Person(1L, 29, "Jack", "Davidson");
        Person person2 = Person.builder()
                .age(22)
                .firstName("Michael")
                .lastName("Corleone")
                .build();
        Person person3 = Person.builder().age(22).firstName("Michael").build();

    }

}
