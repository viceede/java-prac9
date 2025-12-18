public class LinearSearch {

    public static <T> int linearSearch(T[] array, T key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40, 50};
        int index = linearSearch(numbers, 30);
        System.out.println("Индекс элемента 30: " + index);

        String[] words = {"apple", "banana", "cherry"};
        int wordIndex = linearSearch(words, "banana");
        System.out.println("Индекс слова 'banana': " + wordIndex);
    }
}