import java.time.LocalDate;
import java.time.DayOfWeek;

class find_day {
    public static void main(String[] args) {
        int day = 9, month = 7, year = 2024;
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek curr_day = date.getDayOfWeek();
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String dayOfWeekString = days[curr_day.getValue() - 1];
        System.out.println("The day of the week is: " + dayOfWeekString);
    }
}
