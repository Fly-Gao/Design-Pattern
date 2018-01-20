package prototype.test;

import java.util.Date;

/**
 * 深度克隆
 */
public class Client {
    public static void main(String args[]) throws CloneNotSupportedException {
        Date date = new Date(22222222222L);
        Sheep sheep = new Sheep("tom", date);
        Sheep sheep1 = (Sheep) sheep.clone();
        System.out.println(sheep.getBirthday());
        date.setTime(3333333333L);
        System.out.println(sheep.getBirthday());
        System.out.println(sheep1.getBirthday());
    }
}
