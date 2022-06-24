public class Grades {
    private int[] grades;
    private int size;

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
    private int getLast() {
        int last = this.grades[this.grades.length - 1];
        return(last);
    }
    private int averageGrade() {
        int sum = 0;
        for (int i =0; i< this.grades.length; i++) {
            sum += this.grades[i];
        }
        int length = this.grades.length;
        double average = sum / length;
        return(average);
    }
}
