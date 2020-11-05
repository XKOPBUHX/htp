package by.htp.course_1.start.battleHeroes.model;

public enum Faction {
    HERO("Герой"),
    VILLAIN("Злодей");

    private String title;

    Faction(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
