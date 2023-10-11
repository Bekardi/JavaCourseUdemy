import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    private LocalDate currentDate;

    public Worker() {

    }

    public Worker(String name, String birthDate) {

        this.name = name;
        this.birthDate = birthDate;
        this.currentDate = LocalDate.now();
    }

    public LocalDate getDate() {
        System.out.println(currentDate);
       return currentDate;
    }

    public int getAge() {
        //the parse() method obtains an instance of LocalDate from a text string such as 1992-08-11
        LocalDate dob = LocalDate.parse(birthDate);
        //calculates the amount of time between two dates and returns the age of type int
        int age = dob != null ? Period.between(dob, currentDate).getYears() : 0;
        System.out.println("Worker " + name + " is " + age + " y.o.");
        return age;
    }

    public double collectPay() {
    return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
