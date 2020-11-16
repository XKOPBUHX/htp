package by.htp.course_1.start.actors;

public class Actor {
    private final String firstName;
    private final String lastName;
    private final int fee;

    public Actor(String firstName, String lastName, int fee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "(" + fee + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;

        if (fee != actor.fee) return false;
        if (!firstName.equals(actor.firstName)) return false;
        return lastName.equals(actor.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + fee;
        return result;
    }
}
