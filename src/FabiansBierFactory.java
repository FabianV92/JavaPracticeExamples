import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// Implementing Compareable
public class FabiansBierFactory implements Comparable {

    // Creating fields...Price,name,sort
     Double price;
     Double alcPercentage;
     String name;
     String sort;

    // Creating overloaded constructor
    public FabiansBierFactory(Double price, Double alcPercentage, String name, String sort) {
        this.price = price;
        this.alcPercentage = alcPercentage;
        this.name = name;
        this.sort = sort;
    }

    // Overwriting the CompareTo method from the interface Compareable
    @Override
    public int compareTo(Object o) {
        FabiansBierFactory fabianFactory =  (FabiansBierFactory) o;
            return (Double.compare(this.price, fabianFactory.price));
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("Beer price: ").append(price).append(" Alc percentage: ").append(alcPercentage)
                .append(" Name of the beer: ").append(name).append(" Sort of the beer: ").append(sort).toString();
    }
    public static void main(String[] args) {
        List<FabiansBierFactory> myBeer = Arrays.asList(new FabiansBierFactory(1.50,2.5,"BierOne","SortOne"),
                new FabiansBierFactory(1.80,3.6,"BierTwo","SortTwo"),
                new FabiansBierFactory(1.70,1.6,"BierThree","SortThree"),
                new FabiansBierFactory(1.75,0.9,"BierFour","SortFour"),
                new FabiansBierFactory(1.35,6.5,"BierFive","SortFive"),
                new FabiansBierFactory(1.99,1.3,"BierSix","SortSix"),
                new FabiansBierFactory(1.30,2.4,"BierSeven","SortSeven"),
                new FabiansBierFactory(1.76,1.7,"BierEight","SortEight"),
                new FabiansBierFactory(1.55,2.5,"BierNine","SortNine"),
                new FabiansBierFactory(1.52,1.8,"BierTen","SortTen"),
                new FabiansBierFactory(1.88,1.9,"BierEleven","SortEleven"),
                new FabiansBierFactory(1.44,2.0,"BierTwelve","SortTwelve"));

                // Comparator and a anonymous class
                Collections.sort(myBeer, new Comparator<FabiansBierFactory>() {
                    @Override
                    public int compare(FabiansBierFactory o1, FabiansBierFactory o2) {
                        return o1.compareTo(o2);
                    }
                });
                // Lambda
                Comparator<FabiansBierFactory> sortComp =(o1,o2) -> o1.price.compareTo(o2.price);
                myBeer.forEach(System.out::println);
    }
}
