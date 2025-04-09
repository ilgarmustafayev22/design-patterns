package creational.builder;

public class Person {

    private Long id;
    private Integer age;
    private String firstName;
    private String lastName;

    Person(Long id, Integer age, String firstName, String lastName) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{id=%d, age=%d, firstName='%s', lastName='%s'}".formatted(id, age, firstName, lastName);
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {

        private Long id;
        private Integer age;
        private String firstName;
        private String lastName;

        PersonBuilder() {
        }

        public PersonBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public PersonBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Person build() {
            return new Person(id, age, firstName, lastName);
        }

    }

}