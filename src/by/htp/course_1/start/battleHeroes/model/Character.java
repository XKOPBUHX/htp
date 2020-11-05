package by.htp.course_1.start.battleHeroes.model;

import java.util.Objects;

abstract public class Character {

    private final String name;
    private final String description;
    private final Race race;
    private final Faction faction;
    private final int damage;
    private int health;

    public Character(String name, Race race, Faction faction, int health, int damage) {
        this.name = name;
        this.description = getClass().getSimpleName();
        this.faction = faction;
        this.race = race;
        this.health = health;
        this.damage = damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void attack(Character character) {
        System.out.println(this + " атакует " + character);
        character.takeDamage(damage);
    }

    private void takeDamage(int enemyDamage) {
        System.out.println(name + " получает " + enemyDamage + " ед. урона");
        if (health > enemyDamage) {
            health -= enemyDamage;
            System.out.println(name + " остался с " + health + " очками жизни");
        } else {
            kill();
        }
    }

    private void kill() {
        health = 0;
        System.out.println(name + " пал в бою. RIP.");
    }

    @Override
    public String toString() {
        return description + " " + name
                + " (" + faction + ", "
                + race + ", "
                + health + " здоровья)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return damage == character.damage &&
                health == character.health &&
                name.equals(character.name) &&
                description.equals(character.description) &&
                race == character.race &&
                faction == character.faction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, race, faction, damage, health);
    }
}
