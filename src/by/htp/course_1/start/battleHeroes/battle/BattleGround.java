package by.htp.course_1.start.battleHeroes.battle;

import by.htp.course_1.start.battleHeroes.characters.Characters;
import by.htp.course_1.start.battleHeroes.characters.Faction;
import by.htp.course_1.start.battleHeroes.characters.Race;
import by.htp.course_1.start.battleHeroes.characters.classes.*;
import by.htp.course_1.start.battleHeroes.weapon.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BattleGround {
    public static void main(String[] args) {
        List<Characters<?>> characters = fillCharacters();
        while (characters.size() > 1) {
            Random rand = new Random();
            Characters<?> attacker = characters.get(rand.nextInt(characters.size()));
            Characters<?> defender = characters.get(rand.nextInt(characters.size()));
            if (!attacker.equals(defender)) {
                attacker.attack(defender);
                if (!defender.isAlive()) {
                    characters.remove(defender);
                }
            }
        }
        System.out.println("========\nПобедитель: " + characters.get(0));
    }

    private static List<Characters<?>> fillCharacters() {
        List<Characters<?>> characters = new ArrayList<>();

        Archer<Bow> archer = new Archer<>("Леголас", Race.LIGHT_ELF, Faction.HERO, 50, 70);
        archer.setWeapon(new Bow());
        characters.add(archer);

        Mage<Staff> mage = new Mage<>("Дьюк", Race.DARK_ELF, Faction.VILLAIN, 40, 80);
        mage.setWeapon(new Staff());
        characters.add(mage);

        Summoner<Staff> summoner = new Summoner<>("Макс", Race.HUMAN, Faction.HERO, 50, 5);
        summoner.setWeapon(new Staff());
        characters.add(summoner);

        Buffer<Staff> buffer = new Buffer<>("Темный Макс", Race.ORC, Faction.VILLAIN, 70, 25);
        buffer.setWeapon(new Staff());
        characters.add(buffer);

        Warrior<Sword> warrior = new Warrior<>("Тинки", Race.GNOME, Faction.HERO, 80, 50);
        warrior.setWeapon(new Sword());
        characters.add(warrior);

        Tank<Axe> tank = new Tank<>("Винки", Race.GNOME, Faction.HERO, 80, 50);
        tank.setWeapon(new Axe());
        characters.add(tank);

        return characters;
    }
}
