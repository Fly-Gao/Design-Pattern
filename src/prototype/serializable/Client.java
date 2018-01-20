package prototype.serializable;

import java.io.*;
import java.util.Date;

/**
 * Java序列化实现深克隆
 */
public class Client {
    public static void main(String args[]) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Date date = new Date(22222222222222L);
        Sheep sheep = new Sheep("tom", date);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(sheep);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep sheep1 = (Sheep) ois.readObject();

        System.out.println(sheep.getBirthday());
        date.setTime(3333333333333333L);
        System.out.println(sheep.getBirthday());
        System.out.println(sheep1.getBirthday());
    }
}
