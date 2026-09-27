package software.ulpgc.katas;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthDate;

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int age() {
        return toYear(LocalDate.now().toEpochDay() - birthDate.toEpochDay());
    }

    public static final double DAYS_PER_YEAR = 365.25;
    private int toYear(long days) {
        return (int) (days / DAYS_PER_YEAR);
    }
}
