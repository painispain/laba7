import java.util.*;
class stackTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите 5 карт первого игрока ");
        String[] cards = scanner.nextLine().split(" ");
        Stack<Integer> first_c = new Stack<>();
        for (int i = cards.length-1; i >=0; i--) {
            first_c.push(Integer.parseInt(cards[i]));
        }
        System.out.println(first_c);
        Stack<Integer> second_c = new Stack<>();
        System.out.println("Введите 5 карт второго игрока ");
        cards = scanner.nextLine().split(" ");
        for (int i = cards.length-1; i >=0; i--) {
            second_c.push(Integer.parseInt(cards[i]));
        }
        System.out.println(second_c);
        System.out.println(stack.Game(first_c, second_c));
    }
}