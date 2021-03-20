package max.edu;



import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of (2021, Month.JANUARY, 1);
        System.out.println(date.plusDays(255));
        Person max = new Person();
        max.setFirstName("Max");
        max.setMidName("Sergiyovuch");
        max.setLastName("Drozd");
        max.setDateOfBirth(LocalDate.of(1999 ,05 ,26 ));
        max.setAdressCity("Storozhynets");
        max.setAdressHouse("Vydynivskogo street");
        max.setPhoneNumber("+380509023897");
        System.out.println(max);
    }
}
