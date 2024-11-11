class GenericMax {
    public <T extends Comparable<T>> void maxFinder(T[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        T max = array[0];
        System.out.println("Elements in the array:");
        for (T element : array) {
            System.out.println(element);
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        System.out.println("Max is: " + max);
    }
}
