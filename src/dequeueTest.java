
import java.util.*;
class dequeueTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите 5 карт первого игрока ");
        String[] cards = scanner.nextLine().split(" ");
        ArrayDeque<Integer> first_c = new ArrayDeque<>();
        for (String s : cards) {
            first_c.add(Integer.parseInt(s));
        }
        System.out.println(first_c);
        ArrayDeque<Integer> second_c = new ArrayDeque<>();
        System.out.println("Введите 5 карт второго игрока ");
        cards = scanner.nextLine().split(" ");
        for (String card : cards) {
            second_c.add(Integer.parseInt(card));
        }
        System.out.println(second_c);
        System.out.println(dequeue.Game(first_c, second_c));
    }
}