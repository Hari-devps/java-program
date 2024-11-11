public class Main
 {
    public static void main(String[] args) {
        GenericMax max = new GenericMax();
        Integer[] numbers = {14, 3, 42, 5, 6, 10};
        String[] strings = {"R", "Ra", "Raj"};

        max.maxFinder(numbers);
        max.maxFinder(strings);
    }
}
