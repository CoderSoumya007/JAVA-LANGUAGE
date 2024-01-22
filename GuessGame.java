import java.util.Scanner;
import java.util.Random;
class randomNumber{
    int number;
    int userChoice;

    public int takeUserinput(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Guess a Number between 0-100");
      userChoice=sc.nextInt();
      return userChoice;
    }
    public randomNumber(){
        Random rand=new Random();
        number=rand.nextInt(101);
    }
    public void isCorrectNumber(){
        if(userChoice>=0 &&userChoice<101){
System.out.println("The user input is valid");
        }
else{
    System.out.println("INVALID INPUT,INPUT AGAIN");
    takeUserinput();
}
        }
    }
    

public class GuessGame {
  
    public static void main(String[]args){    
        int noguess=1;   
        randomNumber game=new randomNumber();
        System.out.println("PLAYER INPUT IS:"+game.takeUserinput());
        System.out.println(game.number);  //****displays computer choice;
        game.isCorrectNumber();
       do {
        if(game.userChoice==game.number){
            System.out.println("CORRECT GUESS!!");
            System.out.println("CHAMP!!YOU MADE IT IN:"+noguess);
            break;
        }else if(game.userChoice<game.number){
            noguess++;
            System.out.println("Enter a higher number.");
            game.takeUserinput();
        }else{
            System.out.println("Enter a lower number.");
            noguess++;
            game.takeUserinput();
        }
    }while(game.userChoice!=game.number);
    if(game.userChoice==game.number){
        System.out.print("CORRECT GUESS!! ");
        System.out.println("YOU MADE IT IN:"+noguess);
    }

    }
}
