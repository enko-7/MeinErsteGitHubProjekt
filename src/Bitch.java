public class Bitch {
    public static void main(String[] args) {
        int i = 1;


        int x = 1;
        while (i <= 10) {


            System.out.printf("%d. Durchlauf : %d\n", i, x);

            i++;
            x <<= i;

        }
    }
}
