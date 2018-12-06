import org.junit.Test;

public class Ex {

    @Test
    public void eex() {
        B b1 = new B();
        B b2 = new B();
        b1.setA(5);
        System.out.println(b2.getA());
    }
}

class A {
    private static int a = 3;
    //private int a = 3;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

class B extends A {

}
/**
 * @program: designpattern
 * @description:
 * @author: Dainy33
 * @create: 2018-12-06 16:11
 **/
