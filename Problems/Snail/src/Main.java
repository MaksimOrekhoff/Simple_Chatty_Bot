import java.util.Scanner;

class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double H = scanner.nextInt();
        double A = scanner.nextInt();
        double B = scanner.nextInt();
        int day = 1;
                   
                 /*while (day*A-(day-1)*B < H) {
                  
               
                   ++day; 
                                     
                }*/
        day = (int) Math.ceil((H - B) / (A - B));

        System.out.println(day);
    }


}
