import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        String[] options = { "yes", "no" };
        String select = options[ran.nextInt(options.length)];

        System.out.println(select);

        System.out.println("Messi is better player than Christiano ronaldo ? =>  ");
        String player = sc.nextLine();

        if (!player.equalsIgnoreCase(select)) {
            System.out.println("Bomb is blasted!");
            System.exit(0);

        } else {
            System.out.println("Bomb is diffused!");
            System.exit(0);

        }
    }
}
