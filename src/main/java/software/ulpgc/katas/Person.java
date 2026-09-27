package software.ulpgc.katas;

import java.time.LocalDate;

public record Person(String name, LocalDate birthDate) {

    public int age() {
        return toYear(LocalDate.now().toEpochDay() - birthDate.toEpochDay());
    }

    public static final double DAYS_PER_YEAR = 365.25;

    private int toYear(long days) {
        return (int) (days / DAYS_PER_YEAR);
    }
}
