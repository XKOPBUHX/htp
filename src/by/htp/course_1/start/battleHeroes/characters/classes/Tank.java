package by.htp.course_1.start.battleHeroes.characters.classes;

import by.htp.course_1.start.battleHeroes.characters.Characters;
import by.htp.course_1.start.battleHeroes.characters.Faction;
import by.htp.course_1.start.battleHeroes.characters.Race;
import by.htp.course_1.start.battleHeroes.weapon.MeleeWeapon;

public class Tank<MELEE_WEAPON extends MeleeWeapon> extends Characters<MELEE_WEAPON> {
    public Tank(String name, Race race, Faction faction, int health, int damage) {
        super(name,"Танк", race, faction, health, damage);
    }
}
