import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseComparator {
    // Fields
    String name;
    Integer age;

    // Constructor
    public ExerciseComparator(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // Overwriting the toString method
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("My name is ").append(name)
                .append(". I am ").append(age).append("years old. ")
                .toString();
    }

    public static void main(String[] args) {
        // Declaring and initializing
        List<ExerciseComparator> personDetails = Arrays.asList
                (new ExerciseComparator("Brunhilde", 20),
                        new ExerciseComparator("Hans", 25));


        // Comparator with anonymous class descending <-- sexy
        // Comparing the age
        Collections.sort(personDetails, new Comparator<ExerciseComparator>() {
            @Override
            public int compare(ExerciseComparator o1, ExerciseComparator o2) {
                return o2.age.compareTo(o1.age);
            }
        });
        personDetails.forEach(System.out::println);

        // Comparator with lambda ascending <-- THE MOST SEXY
        Comparator<ExerciseComparator> sortViaLambdaComparator= (o1,o2) ->
                o1.age.compareTo(o2.age);
        personDetails.sort(sortViaLambdaComparator);
        personDetails.forEach(System.out::println);
    }
}
