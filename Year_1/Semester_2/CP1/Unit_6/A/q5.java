package Unit_6.A;

public class q5 {
    public static void main(String[] args) {
        int a[] = new int[10];
        for (int i = a.length - 1; i >= 0; i -= 2) {
            a[i] += i;
            System.out.println(a[i]);
        }
    }
}
