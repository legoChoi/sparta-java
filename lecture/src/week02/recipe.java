package week02;

import java.util.*;

public class recipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.nextLine();
        String inputTitle = sc.nextLine();
        String inputRecipe = "";

        String title = "%s(으)로 지정된 %s";

        int cur = 1;

        switch (inputStr) {
            case "List" :
                ArrayList<String> listRecipe = new ArrayList<>();

                while(true) {
                    inputRecipe = sc.nextLine();
                    if (inputRecipe.equals("끝")) break;

                    listRecipe.add(inputRecipe);
                }

                System.out.printf(title + "%n", inputStr,inputTitle);

                for (String s : listRecipe) System.out.println(cur++ + ". " + s);

                break;

            case "Set" :
                Set<String> setRecipe = new HashSet<>();

                while(true) {
                    inputRecipe = sc.nextLine();
                    if (inputRecipe.equals("끝")) break;

                    setRecipe.add(inputRecipe);
                }

                System.out.printf(title + "%n", inputStr,inputTitle);

                for (String s : setRecipe) System.out.println(cur++ + ". " + s);

                break;

            case "Map" :
                Map<Integer, String> mapRecipe = new HashMap<>();

                while(true) {
                    inputRecipe = sc.nextLine();
                    if (inputRecipe.equals("끝")) break;

                    mapRecipe.put(cur++, inputRecipe);
                }

                System.out.printf(title + "%n", inputStr,inputTitle);

                for (int i = 1; i < cur; i++) System.out.println(i + ". " + mapRecipe.get(i));

                break;

            default: break;
        }

        sc.close();
    }
}
