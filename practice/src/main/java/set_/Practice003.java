package set_;

import java.util.*;

public class Practice003 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Employer jack = new Employer("jack", 650);
        Employer tom = new Employer("tom", 1200);
        Employer smith = new Employer("smith", 2900);
        map.put(jack.getName(),jack.getSal());
        map.put(tom.getName(),tom.getSal());
        map.put(smith.getName(),smith.getSal());
        System.out.println(map);
        System.out.println("------------------------");
        jack.setSal(2600);
        map.put(jack.getName(),jack.getSal());
        System.out.println(map);
        
    }
}

class Employer{
    private String name;
    private Integer sal;

    public Employer(String name, Integer sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return Objects.equals(name, employer.name) &&
                Objects.equals(sal, employer.sal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal);
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
