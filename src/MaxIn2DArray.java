public class MaxIn2DArray {

    public static <T extends Comparable<T>> T findMaxIn2D(T[][] matrix) {
        if (matrix == null || matrix.length == 0) return null;
        T max = matrix[0][0];
        for (T[] row : matrix) {
            for (T item : row) {
                if (item.compareTo(max) > 0) {
                    max = item;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[][] intMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Integer maxInt = findMaxIn2D(intMatrix);
        System.out.println("Наибольший элемент в матрице: " + maxInt);
    }
}