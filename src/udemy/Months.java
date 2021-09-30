package udemy;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Months
{
    static String getInput()
    {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Ведите номер месяца от 1 до 12 или 'Q' для выхода: ");
        String inputMonth = myInput.nextLine();
        myInput.close();
        if(inputMonth.equals("Q") || inputMonth.equals("q"))
        {
            return "quit";
        }

        return inputMonth; // "1", "12" , "A" ... not "Q"
    }

    static int getIntMonth()
    {
        int monthInt = 0;
        String strInput = getInput();

        try {
            if(strInput.equals("quit"))
            {
                System.out.println("Quit program.");
                return 0;
            }else{
                monthInt = Integer.parseInt(strInput);
                if(monthInt < 1 || monthInt > 12)
                {
                    getIntMonth();
                }

                return monthInt;
            }

        }catch (NumberFormatException e){
            getIntMonth();
        }

        return monthInt;
    }

    static void switchMonths(int i)
    {
        switch (i) {
            case 0 -> System.out.println("Quit program");
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> {
                System.out.println("No such month exists. Try again.");
                switchMonths(i);
            }
        }
    }

    public static void main(String[] args) {

        int monthNumber = getIntMonth(); // пока инт не получу

        switchMonths(monthNumber);

    }
}
