import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

class exp10_1 {
    public static void main(String a[]) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("First");
        array.add("Second");
        array.add("Third");
        array.add("Fourth");
        Iterator<String> itr = array.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        ArrayList<String> duplicateArray = (ArrayList<String>) array.clone();
        System.out.println("Duplicate Array:" + duplicateArray);
        Collections.reverse(duplicateArray);
        System.out.println("Reversed Array:" + duplicateArray);

    }
}
