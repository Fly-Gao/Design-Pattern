package prototype.serializable;

import java.io.Serializable;
import java.util.Date;

public class Sheep implements Cloneable,Serializable {
    private String name;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }


    public Sheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
