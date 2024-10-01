import java.util.Scanner;

public class GuessImpl {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int randomValue = (int)(Math.random()*10);   
        while(true){
            System.out.println("Guess the num from 0 to 9");
            int num= scanner.nextInt();
            count++;
            if(num == randomValue){
                System.out.println("your made a courrect guess in " + count + " chances");
                break;
            }
            if(num < randomValue){
                System.out.println("too low..");
            }
            else{
                System.out.println("too high..");
            }

        }
    }
}
