package by.htp.course_1.start.battleHeroes.dungeon;

import by.htp.course_1.start.battleHeroes.characters.Characters;
import by.htp.course_1.start.battleHeroes.weapon.MeleeWeapon;

public class MeleeDungeon {

    public static void embarkOnQuest(Characters<? extends MeleeWeapon> hero) {
        System.out.println(hero + " пришел в мили-данж");
    }
}
