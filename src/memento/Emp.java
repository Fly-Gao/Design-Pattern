package memento;

/**
 * 源发器类
 */
public class Emp {
    private String name;
    private int age;

    /**
     * 备份方法
     *
     * @return
     */
    public Memento memento() {
        return new Memento(this);
    }

    public void recovery(Memento memento) {
        name = memento.getName();
        age = memento.getAge();
    }

    public Emp(String name, int age) {
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

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
