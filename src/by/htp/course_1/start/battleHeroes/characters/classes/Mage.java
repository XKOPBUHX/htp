package by.htp.course_1.start.battleHeroes.characters.classes;

import by.htp.course_1.start.battleHeroes.characters.Characters;
import by.htp.course_1.start.battleHeroes.characters.Faction;
import by.htp.course_1.start.battleHeroes.characters.Race;
import by.htp.course_1.start.battleHeroes.weapon.MageWeapon;

public class Mage<MAGE_WEAPON extends MageWeapon> extends Characters<MAGE_WEAPON> {
    public Mage(String name, Race race, Faction faction, int health, int damage) {
        super(name,"Маг", race, faction, health, damage);
    }
}
