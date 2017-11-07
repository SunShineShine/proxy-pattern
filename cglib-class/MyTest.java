import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 *  * Created by lixuelin on 17/9/7.
 *   */
public class MyTest {
        public static void test(int num) {

        }

        public static void main(String[] args) {
                Class clz = MyTest.class;
                Class clz2 = MyInterface.class;
                for (Method m : clz.getDeclaredMethods()) {
                        System.out.println(m.getName());
                        for (Parameter p : m.getParameters()) {
                                System.err.println("  " + p.getName());
                        }
                }
                for (Method m : clz2.getDeclaredMethods()) {
                        System.out.println(m.getName());
                        for (Parameter p : m.getParameters()) {
                                System.err.println("  " + p.getName());
                        }
                }
        }
}

