package by.htp.course_1.start.battleHeroes.characters;

public enum Faction {
    HERO("Герой"),
    VILLAIN("Злодей");

    private final String title;

    Faction(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
