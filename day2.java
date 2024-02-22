import java.util.Scanner;

class day2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char a = obj.next().charAt(0);
        if (a >= 'A' && a <= 'Z') {
            System.out.println("Alphabet");
        } else if (a >= 'a' && a <= 'z') {
            System.out.println("Alphabet");
        } else {
            System.out.println("Not an alphabet");
        }

        obj.close();

    }
}