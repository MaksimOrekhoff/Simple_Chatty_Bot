import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        int d = 0;
        int b = 0;
        int a = 0;
        for (int i = 0; i < n; i++) {
            int grade = scanner.nextInt();
            /*if (grade  2) {
                d++;==
            } else if (grade == 3) {
                c++;
            } else if (grade == 4) {
                b++;

            } else if (grade == 5) {
                a++;
            }*/
            switch(grade) {
                case 2:
                    d++;
                    break;
                case 3:
                    c++;
                    break;
                case 4:
                    b++;
                    break;
                case 5:
                    a++;
                    break;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
        // put your code here
    }
}