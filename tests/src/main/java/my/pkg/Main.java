package my.pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Evklid res = new Evklid();
	System.out.println("Write first number: ");
	int a = in.nextInt();
	System.out.println("Write second number: ");
	int b = in.nextInt();
	System.out.println("Result = " + res.nod(a,b));
    }
}
