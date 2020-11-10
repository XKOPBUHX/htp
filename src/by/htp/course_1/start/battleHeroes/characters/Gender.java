package by.htp.course_1.start.battleHeroes.characters;

public enum Gender {
    MALE("муж."),
    FEMALE("жен.");

    private final String title;

    Gender(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
