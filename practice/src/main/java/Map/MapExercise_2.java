package Map;

import java.util.*;

public class MapExercise_2 {
    public static void main(String[] args) {
        HashMap<String, Student> Map = new HashMap<>();
        Map.put("001", new Student("xxx",22));
        Map.put("002", new Student("zzz",43));
        Map.put("003", new Student("hhh",31));
        Map.put("003", new Student("qqq",18));
//        for (String key:Map.keySet()) {
//            System.out.println(key + "-" + Map.get(key));
//        }
//        for (Map.Entry entry : Map.entrySet()) {
//            System.out.println(entry.getKey() + "-" + ((Student)entry.getValue()).getName());
//        }

//        Set<java.util.Map.Entry<String, Student>> entries = Map.entrySet();
//        Iterator<java.util.Map.Entry<String, Student>> iterator = entries.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        Iterator<String> iterator = Map.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "-" + Map.get(iterator.next()));
        }
    }
}

class Student{
    private String name;
    private int age;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Student() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
