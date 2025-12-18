public class MaxCircleFinder {

    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) return null;
        T max = array[0];
        for (T item : array) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(5.0),
                new Circle(3.2),
                new Circle(7.1),
                new Circle(4.5)
        };

        Circle maxCircle = findMax(circles);
        System.out.println("Наибольший круг: " + maxCircle);
    }
}