import java.util.Scanner;

public class User {

    public static void main(String[] args) {

        UserCheck anna = new UserCheck("Anna", 20);
        UserCheck betty = new UserCheck("Betty", 33);
        UserCheck carl = new UserCheck("Carl", 58);
        UserCheck david = new UserCheck("David", 13);
        UserCheck eva = new UserCheck("Eva", 18);
        UserCheck frankie = new UserCheck("Frankie", 45);

        UserCheck[] users = new UserCheck[]{anna, betty, carl, david, eva, frankie};
        /*double sum = 0;*/
        int average = 0;
        int result = 0;

        for (int i = 0; i < users.length; i++) {
            result += users[i].age;
            average = result / users.length;

        }
        System.out.println("Sum of array elements is: " + result);
        System.out.println("Average of array elements is: " + average);


        for (int j = 0; j < users.length; j++) {
            if (users[j].age < average) {
                System.out.println("Average of array elements is: " + average + " and : " +  users[j].name + " has " +  users[j].age + " years old.");
            }
        }
    }
}











