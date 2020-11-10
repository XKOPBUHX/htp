package by.htp.course_1.start.battleHeroes.characters.classes;

import by.htp.course_1.start.battleHeroes.characters.Characters;
import by.htp.course_1.start.battleHeroes.characters.Faction;
import by.htp.course_1.start.battleHeroes.characters.Race;
import by.htp.course_1.start.battleHeroes.weapon.MeleeWeapon;

public class Warrior<WARRIOR_WEAPON extends MeleeWeapon> extends Characters<WARRIOR_WEAPON> {

    public Warrior(String name, Race race, Faction faction, int health, int damage) {
        super(name,"Воин", race, faction, health, damage);
    }
}
