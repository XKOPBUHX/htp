package by.htp.course_1.start.battleHeroes.characters.classes;

import by.htp.course_1.start.battleHeroes.characters.Characters;
import by.htp.course_1.start.battleHeroes.characters.Faction;
import by.htp.course_1.start.battleHeroes.characters.Race;
import by.htp.course_1.start.battleHeroes.weapon.RangeWeapon;

public class Archer<WEAPON_ARCHER extends RangeWeapon> extends Characters<WEAPON_ARCHER> {
    public Archer(String name, Race race, Faction faction, int health, int damage) {
        super(name, "Лучник", race, faction, health, damage);
    }
}
