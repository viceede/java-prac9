public class ArrayGenericStack<E> {
    private E[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public ArrayGenericStack() {
        array = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (isEmpty()) return null;
        return array[size - 1];
    }

    public void push(E o) {
        if (size == array.length) {
            resize();
        }
        array[size++] = o;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        E[] newArray = (E[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public E pop() {
        if (isEmpty()) return null;
        E o = array[--size];
        array[size] = null;
        return o;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Стек: [");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayGenericStack<String> stack = new ArrayGenericStack<>();
        stack.push("Java");
        stack.push("Generics");
        stack.push("Stack");
        System.out.println(stack);
        System.out.println("Вершина: " + stack.peek());
        System.out.println("Извлечено: " + stack.pop());
        System.out.println(stack);
    }
}