package developerProductivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dspiegs on 2/3/17.
 */
public class FooUser {

    public static void main (String[] args) {

        List<String> stringList1 = new ArrayList<>();
        List<String> stringList2 = new ArrayList<>();
        List<String> stringList3 = new ArrayList<>();

        Foo foo = new Foo();
        foo.foo(stringList1, stringList3, stringList2);
    }
}
