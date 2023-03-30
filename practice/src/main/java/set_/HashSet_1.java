package set_;

import java.util.HashSet;
import java.util.Objects;

public class HashSet_1 {
    public static void main(String[] args) {
        HashSet<Person> peoples = new HashSet<>();
        for (int i = 0; i<= 100; i++){
            peoples.add(new Person(i));
        }
        
        System.out.println(peoples);
    }
}

class Person{
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
