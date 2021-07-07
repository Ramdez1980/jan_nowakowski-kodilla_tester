public class Loops {
    public static void main(String[] args) {

        String[] names = new String[] {"Zygfryd" , "Gwidon", "Florentyna"};


        int numberOfElements = names.length;

        if ( numberOfElements==1) {
            System.out.println("tablica zawiera:" + " " + numberOfElements + " " + "element");
        } else {
            System.out.println("tablica zawiera:" + " " + numberOfElements + " " + "elementy");
        }

        for (int i = 0; i < numberOfElements; i++) {
            System.out.println(names[i]);
        }

        System.out.println("-----------------");

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}