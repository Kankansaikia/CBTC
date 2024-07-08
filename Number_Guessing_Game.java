import java.util.*;
public class Number_Guessing_Game{
    public static void main(String args[])
    {
        int chance=10;
        int points=100;
        int attempt=0;
        Random rand=new Random();
        int number=rand.nextInt(100);
        System.out.println("Welcome to the game.You have 10 chance to predict the number");
        System.out.println("Guess the number");
        Scanner input=new Scanner(System.in);
        int guess=input.nextInt();
        while (chance>0){
            attempt++;
            chance--;
            if(guess<number) {
                if(chance==0){
                    System.out.println("Out of Chance...Better luck next Time!!!");
                    break;
                }

                System.out.println("You have "+chance+" chances left");
                System.out.println("Enter a greater number");
                guess=input.nextInt();
                points=points-10;
            }
            else if(guess>number) {
                if(chance==0){
                    System.out.println("Out of Chance...Better luck next Time!!!");
                    break;
                }
                System.out.println("You have "+chance+" chances left");
                System.out.println("Enter a lower number");
                guess=input.nextInt();
                points=points-10;
            }
            else{
                System.out.println("Hurrah You guessed the number "+number+" in "+
                attempt+" attempts.");
                break;
            }
        }
        
        input.close();
    }
    
}
