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
    public double average() {
        if (size == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + grades[i];

        }
        return sum / size;
    }

    public int getLast() {
        if (size == 0) {
            return 0;
        }
        return grades[size - 1];


    }
}

