package examples;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {

        public static void main(String[] args) {
            LocalDateTime dateTime = LocalDateTime.of(2007, 02, 27, 00, 00, 00);
            Duration showSeconds = calculateAgeDuration(dateTime, LocalDateTime.now());
            calculateTime(showSeconds.getSeconds());
            calculateAge();
        }



        public static Duration calculateAgeDuration(LocalDateTime dayBefore, LocalDateTime currentDay) {
            return Duration.between(dayBefore, currentDay);
        }


        public static long calculateTime(long timeSeconds) {
            long days = timeSeconds / 86400; // 24*60*60
            long hours = timeSeconds / 3600;
            long minutes = (timeSeconds % 3600) / 60;
            long seconds = (timeSeconds % 3600) % 60;

            long  totalSeconds= (hours)*60*60 +(minutes)*60+(seconds);

            System.out.println("Days: " + days);
            System.out.println("Hours: " + hours);
            System.out.println("Minutes: " + minutes);
            System.out.println("Seconds: " + seconds);
            System.out.println("Your age in Seconds :"+totalSeconds);
            return totalSeconds;
        }

        public static  double calculateAge(){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
            LocalDate today = LocalDate.now();
            LocalDate birthday = LocalDate.parse("27/02/2007", formatter);


            Period p = Period.between(birthday, today);
            System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
                    " months and " + p.getDays() +
                    " days old.");
            double seconds = p.getYears()*365.24;
            System.out.println("No of Days :"+ seconds);
            seconds = seconds + p.getMonths()*30.43;
            System.out.println("No of Days :"+ seconds);
            seconds =(seconds + p.getDays())*24;
            System.out.println("No of Hours :"+ seconds);
            seconds =seconds*3600;
            System.out.println("No of Seconds :"+ seconds);
            System.out.println("Your age in Seconds is: "+seconds);
            return seconds;
          }

    }

