package memento;

/**
 * 备忘录类
 */
public class Memento {
    private String name;
    private int age;

    public Memento(Emp emp) {
        name = emp.getName();
        age = emp.getAge();
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
    public String toString() {
        return "Memento{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
