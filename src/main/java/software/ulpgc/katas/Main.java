package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person Lucia = new Person("Lucia", LocalDate.of(1990, 1, 1));
        System.out.println(Lucia.age());
    }
}
