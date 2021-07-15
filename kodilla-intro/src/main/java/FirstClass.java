public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(500, 1000, 2017, 2);
        System.out.println(notebook.weight + " g |"  + " " + notebook.price + " zł. | " + notebook.year + " rok" );
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        notebook.checkNumber();


        Notebook heavyNotebook = new Notebook(1000, 1500, 2021, 3);
        System.out.println(heavyNotebook.weight + " g" + " " + heavyNotebook.price + " zł. " + heavyNotebook.year + " rok" );
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        heavyNotebook.checkNumber();

        Notebook oldNotebook = new Notebook(2000, 500, 2007, 1);
        System.out.println(oldNotebook.weight + " g" + " " + oldNotebook.price + " zł. " + oldNotebook.year + " rok" );
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        oldNotebook.checkNumber();


    }
}
