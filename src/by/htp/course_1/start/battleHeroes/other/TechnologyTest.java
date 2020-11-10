package by.htp.course_1.start.battleHeroes.other;

import by.htp.course_1.start.battleHeroes.characters.Faction;
import by.htp.course_1.start.battleHeroes.characters.Gender;
import by.htp.course_1.start.battleHeroes.characters.Race;
import by.htp.course_1.start.battleHeroes.characters.classes.Warrior;
import by.htp.course_1.start.battleHeroes.dungeon.MeleeDungeon;
import by.htp.course_1.start.battleHeroes.weapon.Sword;

public class TechnologyTest {
    public static void main(String[] args) {
        printGenderData(Gender.MALE);

        Warrior<Sword> warrior = new Warrior<>("test", Race.DARK_ELF, Faction.HERO, 100, 20);
        warrior.setWeapon(new Sword());
        Sword weapon = warrior.getWeapon();
        System.out.println(weapon.getDamage());

        MeleeDungeon.embarkOnQuest(warrior);
    }

    public static void printGenderData(Gender gender) {
        System.out.println(gender);
    }
}
