package prototype;

import java.util.ArrayList;
import java.util.List;

public class GameBotCharacters implements Cloneable {
    private String name;
    private int health;
    private int attackPower;
    private List<String> weapons;


    @Override
    public GameBotCharacters clone() {
        try {
            GameBotCharacters gbc = (GameBotCharacters) super.clone();
            gbc.setWeapons(new ArrayList<>(gbc.weapons));
            return gbc;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }

    }

    public String toString() {
        return "GameBotCharacters{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attackPower=" + attackPower +
                ", weapons=" + weapons +
                '}';
    }

    public List<String> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<String> weapons) {
        this.weapons = weapons;
    }

    public void setName(String name) {
        this.name = name;
    }


    public GameBotCharacters(String name, int health, int attackPower, List<String> weapons) {

        //Expensive operation
        System.out.println("Loading character animations from DB..");
        System.out.println("Loading Sound effects from DB..");
        System.out.println("Preparing AI battle Settings File..");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.weapons = weapons;
    }
}
