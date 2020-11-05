package by.htp.course_1.start.battleHeroes.battle;

import by.htp.course_1.start.battleHeroes.model.classes.Archer;
import by.htp.course_1.start.battleHeroes.model.classes.Buffer;
import by.htp.course_1.start.battleHeroes.model.classes.Warrior;
import by.htp.course_1.start.battleHeroes.model.Character;
import by.htp.course_1.start.battleHeroes.model.Faction;
import by.htp.course_1.start.battleHeroes.model.Race;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BattleGround {
    public static void main(String[] args) {
        List<Character> characters = fillCharacters();
        while (characters.size() > 1) {
            Random rand = new Random();
            Character attacker = characters.get(rand.nextInt(characters.size()));
            Character defender = characters.get(rand.nextInt(characters.size()));
            if (!attacker.equals(defender)) {
                attacker.attack(defender);
                if (!defender.isAlive()) {
                    characters.remove(defender);
                }
            }
        }
        System.out.println("========\nПобедитель: " + characters.get(0));
    }

    private static List<Character> fillCharacters() {
        List<Character> characters = new ArrayList<>();
        characters.add(new Archer("Леголас", Race.LIGHT_ELF, Faction.HERO, 50, 70));
        characters.add(new Archer("Дьюк", Race.DARK_ELF, Faction.VILLAIN, 40, 80));
        characters.add(new Buffer("Макс", Race.HUMAN, Faction.HERO, 50, 5));
        characters.add(new Buffer("Темный Макс", Race.ORC, Faction.VILLAIN, 70, 25));
        characters.add(new Warrior("Тинки", Race.GNOME, Faction.HERO, 80, 50));
        return characters;
    }
}
