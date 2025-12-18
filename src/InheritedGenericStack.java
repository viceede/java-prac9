import java.util.ArrayList;
import java.util.Scanner;

public class InheritedGenericStack<E> extends ArrayList<E> {

    public E peek() {
        if (isEmpty()) return null;
        return get(size() - 1);
    }

    public void push(E o) {
        add(o);
    }

    public E pop() {
        if (isEmpty()) return null;
        return remove(size() - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InheritedGenericStack<String> stack = new InheritedGenericStack<>();

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            stack.push(scanner.nextLine());
        }

        System.out.println("\nСтроки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}