package Unit_6.A;

public class q6 {
    public static void main(String[] args) {
        boolean flag = false;

        int a[] = new int[10];

        int i = 1;

        while (!flag) {

            a[i] += i;

            if (i >= a.length) {

                flag = true;

            }

            System.out.println(a[i]);

            i++;

        }

    }
}
