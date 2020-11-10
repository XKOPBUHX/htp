package by.htp.course_1.start.battleHeroes.characters;

import by.htp.course_1.start.battleHeroes.weapon.Weapon;

abstract public class Characters<WEAPON extends Weapon> {

    private WEAPON weapon;
    private final String name;
    private final String description;
    private final Race race;
    private final Faction faction;
    private final int damage;
    private int health;

    public Characters(String name, String description, Race race, Faction faction, int health, int damage) {
        this.name = name;
        this.description = description;
        this.faction = faction;
        this.race = race;
        this.health = health;
        this.damage = damage;
    }

    public WEAPON getWeapon() {
        return weapon;
    }

    public void setWeapon(WEAPON weapon) {
        this.weapon = weapon;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void attack(Characters<?> character) {
        System.out.println(this + " атакует " + character);
        character.takeDamage(damage + weapon.getDamage());
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Characters<?> that = (Characters<?>) o;

        if (damage != that.damage) return false;
        if (health != that.health) return false;
        if (!weapon.equals(that.weapon)) return false;
        if (!name.equals(that.name)) return false;
        if (!description.equals(that.description)) return false;
        if (race != that.race) return false;
        return faction == that.faction;
    }

    @Override
    public int hashCode() {
        int result = weapon.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + race.hashCode();
        result = 31 * result + faction.hashCode();
        result = 31 * result + damage;
        result = 31 * result + health;
        return result;
    }

    @Override
    public String toString() {
        return description + " " + name
                + " (" + faction + ", "
                + race + ", "
                + health + " здоровья)";
    }

}
