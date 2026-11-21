package prototype;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        GameBotCharacters gbc1 = new GameBotCharacters("Bot1", 100, 0, new ArrayList<>(Arrays.asList("Rifel")));
        GameBotCharacters gbc2 = gbc1.clone();
        gbc2.setName("Bot2");
        GameBotCharacters gbc3 = gbc1.clone();
        gbc3.setName("Bot3");
        GameBotCharacters gbc4 = gbc1.clone();
        gbc4.setName("Bot4");
        GameBotCharacters gbc5 = gbc1.clone();
        gbc5.setName("Bot5");
        GameBotCharacters gbc6 = gbc1.clone();
        gbc6.setName("Bot6");
        List<String> weaponsList = gbc5.getWeapons();
        weaponsList.add("Grenade");

        long endTime = System.currentTimeMillis();
        System.out.println("Created characters:");
        System.out.println(gbc1);
        System.out.println(gbc2);
        System.out.println(gbc3);
        System.out.println(gbc4);
        System.out.println(gbc5);
        System.out.println(gbc6);
        System.out.println("Time taken to create characters: " + (endTime - startTime) + " ms");

    }
}
