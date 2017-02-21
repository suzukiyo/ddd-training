package introduction.domain.fundamentals.basic.birthday;

import introduction.domain.fundamentals.basic.Age;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Birthday {
    Year year;
    Month month;
    Day day;

    public Age age() {
        LocalDate birthday = LocalDate.of(year.value, month.value, day.value);
        LocalDate today = LocalDate.now();
        return new Age((int) ChronoUnit.YEARS.between(birthday, today));
    }
}
