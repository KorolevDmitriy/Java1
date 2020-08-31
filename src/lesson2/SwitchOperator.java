package lesson2;

public class SwitchOperator {

    public static void main(String[] args) {
        String month = "June";
        int daysNumber = getNumberOfDaysInMonth(month);
        System.out.println(month + " has " + daysNumber + "days");

        int a = 1;
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;
            case 3:
                System.out.println("a = 3");
                break;
            default:
                System.out.println("Ни одного из case не сработал");
        }
    }

    private static int getNumberOfDaysInMonth(String month) {
        switch (month) {
            case "January":
                return 31;
            case "February":
                return 28;
            case "March":
                return 31;
            case "April":
                return 30;
            case "May":
                return 31;
            case "June":
                return 30;
            case "July":
            case "August":
                return 31;
            case "September":
                return 30;
            case "October":
                return 31;
            case "November":
                return 30;
            case "December":
                return 31;
            default:
                return -1;
        }
    }
}
