package by.htp.course_1.start.battleHeroes.model.classes;

import by.htp.course_1.start.battleHeroes.model.Character;
import by.htp.course_1.start.battleHeroes.model.Faction;
import by.htp.course_1.start.battleHeroes.model.Race;

public class Summoner extends Character {
    public Summoner(String name, Race race, Faction faction, int health, int damage) {
        super(name, race, faction, health, damage);
    }
}
