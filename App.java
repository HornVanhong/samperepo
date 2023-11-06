import java.util.Scanner;

public class App {
   public static void main(String[] args)
   {
        String[] name = new String[4];
        Scanner scanner = new Scanner(System.in);
        for(int i=1;i<4;i++){
           name[i] =scanner.nextLine();

        }
        for (String i : name) {
            System.out.println(i);
            
        }


   }
}
