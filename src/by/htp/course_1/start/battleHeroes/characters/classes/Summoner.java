package by.htp.course_1.start.battleHeroes.characters.classes;

import by.htp.course_1.start.battleHeroes.characters.Characters;
import by.htp.course_1.start.battleHeroes.characters.Faction;
import by.htp.course_1.start.battleHeroes.characters.Race;
import by.htp.course_1.start.battleHeroes.weapon.MageWeapon;

public class Summoner<MAGE_WEAPON extends MageWeapon> extends Characters<MAGE_WEAPON> {
    public Summoner(String name, Race race, Faction faction, int health, int damage) {
        super(name,"Саммонер", race, faction, health, damage);
    }
}
