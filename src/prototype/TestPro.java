package prototype;

public class TestPro {
    public static void testNew() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            Pro pro = new Pro();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void testClone() throws CloneNotSupportedException {
        long start = System.currentTimeMillis();
        Pro pro = new Pro();
        for (int i = 0; i < 20000; i++) {
            Pro pro1 = pro.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        testNew();
        testClone();
    }
}

class Pro implements Cloneable {

    public Pro(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected Pro clone() throws CloneNotSupportedException {
        return (Pro) super.clone();
    }
}
