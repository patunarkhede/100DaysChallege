import java.util.Scanner;

class day6 {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
        int x = var1.nextInt();
        int y = var1.nextInt();
        {
            if (x > 0 && y > 0) {

                System.out.println("this point lies in frist quadrant");
            }

            else if (x < 0 && y > 0) {
                System.out.println("this point lies in second quadrant");
            }

            else if (x > 0 && y < 0) {
                System.out.println("this point lies in thired quadrant");
            }

            else if (x < 0 && y < 0) {
                System.out.println("this point lies in fourth quadrant");
            }

        }
        var1.close();
    }
}
