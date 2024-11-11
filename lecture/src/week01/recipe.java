package week01;

import java.util.Scanner;

public class recipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        int score = (int) sc.nextFloat();
        int cur = 1;

        sc.nextLine();

        String[] recipe = new String[10];

        for (int i = 0; i < recipe.length; i++) recipe[i] = sc.nextLine();

        System.out.println("[ " + title + " ]");
        System.out.println("별점: " + score + " (" + (score * 100 / 5.0) + "%)");

        for (String s : recipe) System.out.println(cur++ + ". " + s);

        sc.close();
    }
}
