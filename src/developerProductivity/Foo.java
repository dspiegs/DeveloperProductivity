package developerProductivity;

import java.util.List;

/**
 * Created by dspiegs on 9/8/16.
 */
public class Foo {

    public void foo(List<String> stringList1, List<String> stringList3, List<String> stringList2) {
        for(String s : stringList1) {
            if("match".equals(s)) {
                System.out.println(s);
                System.out.println("blah");
                System.out.println("blahblah");
            }
        }

        for(String s : stringList2) {
            if("match".equals(s)) {
                System.out.println(s);
                System.out.println("blah");
                System.out.println("blahblah");
            }
        }

        for(String s : stringList3) {
            if("match".equals(s)) {
                System.out.println(s);
                System.out.println("blah");
                System.out.println("blahblah");
            }
        }

        int a = 1 + 1;
        int b = a + 2;
        int c = b + 3;
        int d = c + 4;
        int f = a * b * c * d;
        System.out.println(f);
    }
}
