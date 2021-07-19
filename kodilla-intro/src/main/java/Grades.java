public class Grades {
    private int[] grades;
    private int size;
    private int lastGrade;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void srednia(int srednia,int sum) {


        for (int i = 0; i <= 10; i++) {
            sum += grades[i];
        }

        int numberOfElements = grades.length;

        srednia = sum / numberOfElements;


        System.out.println("Sum of array elements is:" + sum);
        System.out.println("srednia" + srednia);


    }
}

