// 일요일 0 ~ 토요일 6
// 

package lecture_230310;

public class Problem_1 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter today's day: ");
        int today = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();

        String nameForToday = "Null";
        // 조건에 맞게 nameForToday 지정
        switch(today) {
            case 0 : nameForToday = "Sunday";
            break;
            case 1 : nameForToday = "Monday";
            break;
            case 2 : nameForToday = "Tuesday";
            break;
            case 3 : nameForToday = "Wednesday";
            break;
            case 4 : nameForToday = "Thursday";
            break;
            case 5 : nameForToday = "Friday";
            break;
            case 6 : nameForToday = "Saturday";
            break;
        }

        int futureDay = today + elapsedDays;

        String nameForFutureDay = "Null";
        // 조건에 맞게 지정
        
        switch(futureDay % 7) {
            case 0 : nameForFutureDay = "Sunday";
            break;
            case 1 : nameForFutureDay = "Monday";
            break;
            case 2 : nameForFutureDay = "Tuesday";
            break;
            case 3 : nameForFutureDay = "Wednesday";
            break;
            case 4 : nameForFutureDay = "Thursday";
            break;
            case 5 : nameForFutureDay = "Friday";
            break;
            case 6 : nameForFutureDay = "Saturday";
            break;
        }

         System.out.println("Today is " + nameForToday + " and the future day is " + nameForFutureDay);
    }
}
