public class SimpleArray {
    public static void main(String[] args) {

    String[] Names = new String[5];

        Names[0] = "Jan";
        Names[1] = "Figa";
        Names[2] = "Krystyna";
        Names[3] = "Alicja";
        Names[4] = "Katarzyna";

        String Name = Names[3];

        System.out.println(Name);

        int numberOfElements = Names.length;

        System.out.println("Moja tablica zawiera" + " " +  numberOfElements + " " + "elementów");
    }
}
