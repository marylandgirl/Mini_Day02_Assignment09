import java.util.Scanner;
import java.lang.StringBuffer;
import java.lang.Integer;

public class ConvertDate {
    public static void main(String[] args) {
        StringBuffer mmStr = new StringBuffer();
        StringBuffer ddStr = new StringBuffer();
        StringBuffer yyyyStr = new StringBuffer();
        int month;
        int day;
        int year;
        String monthStr = "";
        String input;

        Scanner keybd = new Scanner(System.in);

        System.out.print("Enter a date (mm/dd/yyyy): ");
        input = keybd.nextLine();
        mmStr.append(input.charAt(0));
        mmStr.append(input.charAt(1));
        ddStr.append(input.charAt(3));
        ddStr.append(input.charAt(4));
        yyyyStr.append(input.charAt(6));
        yyyyStr.append(input.charAt(7));
        yyyyStr.append(input.charAt(8));
        yyyyStr.append(input.charAt(9));

        month = Integer.parseInt(mmStr.toString());
        day = Integer.parseInt(ddStr.toString());
        year = Integer.parseInt(yyyyStr.toString());

        switch(month) {
            case 1:
                monthStr = "January";
                break;
            case 2:
                monthStr = "February";
                break;
            case 3:
                monthStr = "March";
                break;
            case 4:
                monthStr = "April";
                break;
            case 5:
                monthStr = "May";
                break;
            case 6:
                monthStr = "June";
                break;
            case 7:
                monthStr = "July";
                break;
            case 8:
                monthStr = "August";
                break;
            case 9:
                monthStr = "September";
                break;
            case 10:
                monthStr = "October";
                break;
            case 11:
                monthStr = "November";
                break;
            case 12:
                monthStr = "December";
                break;
            default:
                monthStr = "";
                break;
        }

        if (!monthStr.equals(""))
            System.out.printf("It is %s %d, %d", monthStr, day,year);
        else
            System.out.print("You entered an invalid date.");
    }
}
