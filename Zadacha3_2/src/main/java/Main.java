import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(calc(target));
    }


    static int calc(int target) {
        int steps = 0;
        int level = 1;
        while (level * level < target) {
            level += 2;
            steps += 1;
        }
        int right = 2;
        int up = 4;
        int left = 6;
        int down = 8;
        for (int i = 1; i < steps; i++) {
            right += 9 + 8 * (i - 1);
            up = right + 2 * (i + 1);
            left = up + 2 * (i + 1);
            down = left + 2 * (i + 1);
        }
        int min = Math.abs(target - right) + steps;
        if (Math.abs(target - up) + steps < min) {
            min = Math.abs(target - up) + steps;
        }

        if (Math.abs(target - left) + steps < min) {
            min = Math.abs(target - left) + steps;
        }
        if (Math.abs(target - down) + steps < min) {
            min = Math.abs(target - down) + steps;
        }
        return min;
    }
}
