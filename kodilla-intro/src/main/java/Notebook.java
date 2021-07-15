public class Notebook {
    int weight;
    int price;
    int year;
    int number;

    public Notebook (int weight, int price, int year, int number) {
        this.weight = weight;
        this.price = price;
        this.year = year;
        this.number = number;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000 ) {
            System.out.println("This notebook is quite expensive.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This nootebook is light");
        } else if (this.weight >= 1000 && this.weight < 1300) {
            System.out.println("This nootebook is not too heavy");
        } else {
            System.out.println("This nootebook is very heavy");
        }
    }
    public void checkYear() {
        if (this.year >=2020) {
            System.out.println("This nootebook is new");
        } else if (this.year < 2020 && this.year>2017)
        {
            System.out.println("This nootebook is quite new");
        }
    }
    public void checkNumber() {
        if (this.number == 1) {
            System.out.println("Ten laptop jest z: " + this.year + " roku " +   "dlatego kosztuje tylko " + this.price + " zł.");
        } else if (this.number == 2){
            System.out.println("Ten laptop jest z: " + this.year + " roku "  + "dlatego kosztuje " + this.price + " zł.");

        } else {
            System.out.println("Ten laptop jest z: " + this.year + " roku "  +"dlatego kosztuje " + this.price + " zł. " + "Fajne ale drogie." );

        }
    }
}
