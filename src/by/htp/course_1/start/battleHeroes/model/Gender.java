package by.htp.course_1.start.battleHeroes.model;

public enum Gender {
    MALE("муж."),
    FEMALE("жен.");

    private String title;

    Gender(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
