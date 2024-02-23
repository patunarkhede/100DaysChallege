import java.util.Scanner;

class day3 {

    public static void main(String[] args) {
        // System.out.println("Enter a charater");

        Scanner obj = new Scanner(System.in);
        char ch = obj.next().charAt(0);

        System.out.println((int) ch);

        obj.close();
    }

}
