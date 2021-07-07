public class  LeapYear {
    public static void main(String[] args) {
        int year = 2300;
        boolean a = year % 2 == 0;
        boolean b = year % 100 == 0;
        boolean c = year % 400 == 0 ;
        boolean leapYear1 = true;
        boolean notLeapYear1 = false;
        System.out.println(year);


        if (a && b && c ){
            System.out.println(leapYear1);
        } else {
            System.out.println(notLeapYear1);
        }

        }

}

