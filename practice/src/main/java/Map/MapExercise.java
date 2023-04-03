package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        HashMap<Integer, Employee> employeeMap = new HashMap<>();
        Employee xzh = new Employee("徐子豪", 10000.0, 1);
        employeeMap.put(xzh.getId(),xzh);
        Employee wwc = new Employee("王婉晨", 200000.0, 2);
        employeeMap.put(wwc.getId(),wwc);
        Employee jy = new Employee("皎月", 5000.0, 3);
        employeeMap.put(jy.getId(),jy);

//        for (Integer i:employeeMap.keySet()
//             ) {
//            if (employeeMap.get(i).getSal() > 18000.0){
//                System.out.println("员工编号："+i + "，工资为" + employeeMap.get(i).getSal());
//            }
//        }
        for (Object obj:employeeMap.entrySet()
             ) {
            Map.Entry entry = (Map.Entry)obj;
            if (((Employee)entry.getValue()).getSal() > 18000.0){
                System.out.println("编号为：" + entry.getKey() + "的员工，工资为" + ((Employee)entry.getValue()).getSal());
            }        
        }
    }
}


class Employee{
    private String name;
    private Double sal;
    private int id;

    public Employee(String name, Double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(name, employee.name) &&
                Objects.equals(sal, employee.sal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}