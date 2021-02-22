public class GenericClassEXAMPLE<M> {
    private M test;

    // Constructor
    public GenericClassEXAMPLE(M test) {
        this.test = test;
    }

    // Get method
    public M getTest() {
        return test;
    }

    public static void main(String[] args) {

        // Creating Objects
        GenericClassEXAMPLE<String> stringObject = new GenericClassEXAMPLE<>("This is cool");
        GenericClassEXAMPLE<Integer> integerObject = new GenericClassEXAMPLE<>(5);
        // Displaying the Objects in the console
        System.out.println(stringObject.getTest());
        System.out.println(integerObject.getTest());

    }
}

