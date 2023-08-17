package Player2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Period{

    private LocalDate birthDate;

    public Period(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(birthDate, LocalDate.now());
    }
}