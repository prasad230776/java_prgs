import java.util.Scanner;

class NumberGuess{
    public static void main(String[] args) {
        int count = 0;
        int num = (int) (Math.random()*10);
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Your guess from 0 to 9: ");
            int guess = scanner.nextInt();
            count++;
            if(guess == num){
                System.out.println("your guess is correct in " + count + " chances");
                break;
            }else{
                if(guess < num){
                    System.out.println("too loo..");
                }else{
                    System.out.println("too high..");
                }
            }
        }
        scanner.close();
          
        
    }
}