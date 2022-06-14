public class LeapYear {
    public static void main (String [] args) {
        int year = 2022;

        System.out.println(year);

        if(year % 400 == 0) {
            System.out.println("Przestępny");
        } else if (year % 100 == 0) {
            System.out.println("Nie Przestępny");
        } else if (year % 4 == 0) {
            System.out.println("Przestępny");
        } else {
            System.out.println("Nie przestępny");
            
        }

    }

    }
