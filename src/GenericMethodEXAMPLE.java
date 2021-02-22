
import java.util.ArrayList;
import java.util.List;

public class GenericMethodEXAMPLE {


    // Example Generic method
    static <T> int findIndex(List<T> myList, T myObject) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).equals(myObject)) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        // Find index with using a Double Array List
        List<Double> dArrList = new ArrayList<Double>();
        dArrList.add(3.5); //Hinter den Kulissen: Autoboxing
        dArrList.add(6.7);
        dArrList.add(9.9);
        System.out.println(findIndex(dArrList, 6.7));


        // Find index with using an Integer Array List
        List<Integer> iArrList = new ArrayList<Integer>();
        iArrList.add(3); //Hinter den Kulissen: Autoboxing
        iArrList.add(89);
        iArrList.add(123);
        iArrList.add(77);
        iArrList.add(20);
        System.out.println(findIndex(iArrList, 77));

        // Find index with using a an  Array List filled with String Objects
        List<String> sArrList = new ArrayList<>();
        sArrList.add("Fabian");
        sArrList.add("Horst");
        sArrList.add("Otto");
        sArrList.add("Hans");
        System.out.println(findIndex(sArrList, "Horst"));

        // Find index with using an Array List filled with Objects
        List<GenericMethodEXAMPLE> gArrList = new ArrayList<>();
        GenericMethodEXAMPLE test0 = new GenericMethodEXAMPLE();
        GenericMethodEXAMPLE test1 = new GenericMethodEXAMPLE();
        GenericMethodEXAMPLE test2 = new GenericMethodEXAMPLE();
        GenericMethodEXAMPLE test3 = new GenericMethodEXAMPLE();
        gArrList.add(test0);
        gArrList.add(test1);
        gArrList.add(test2);
        gArrList.add(test3);

        System.out.println(findIndex(gArrList, test0));
    }

}
/*
    // Working with Object test
    Object[] test1 = new Object[9];
    test1[0] = "128";
    test1[1] = 128;
    // OBJECT INTO int (int+String)
    int ergebnis = (int) test1[1]/Integer.parseInt((String)test1[0]);
        System.out.println(ergebnis);
*/


