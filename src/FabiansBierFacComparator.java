import java.util.Comparator;

public class FabiansBierFacComparator implements Comparator<FabiansBierFactory> {


    @Override
    public int compare(FabiansBierFactory o1, FabiansBierFactory o2) {
        return o1.price.compareTo(o2.price);
    }

}
