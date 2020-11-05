package by.htp.course_1.start.battleHeroes.model;

public enum Race {
    HUMAN("Человек"),
    LIGHT_ELF("Светлый эльф"),
    DARK_ELF("Темный эльф"),
    ORC("Орк"),
    GNOME("Гном"),
    UNDEAD("Нежить");

    private String title;

    Race(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
