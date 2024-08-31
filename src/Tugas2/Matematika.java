package Tugas2;

public class Matematika implements IMatematika {
    public void pertambahan(int a, int b) {
        int c = a + b;
        System.out.println("Hasil pertambahan " + a + " + " + b + " = " + c);
    }
    public void pengurangan(int a, int b) {
        int c = a - b;
        System.out.println("Hasil pengurangan " + a + " - " + b + " = " + c);
    }
    public void perkalian(int a, int b) {
        int c = a * b;
        System.out.println("Hasil perkalian " + a + " * " + b + " = " + c);
    }
    public void pembagian(int a, int b) {
        int c = a / b;
        System.out.println("Hasil pembagian " + a + " / " + b + " = " + c);
    }
}