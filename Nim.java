import java.util.Scanner;
public class Nim {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int initialSticks = (int)(Math.random() * 10) + 1;
        System.out.println(initialSticks);
        int sticks = initialSticks;

        int roundCount = 0;

        while (initialSticks > 0){
            if (roundCount % 2 == 0){
                int humanMove = 0;
                if (initialSticks > 1){
                    while (humanMove < 1 || humanMove > 2){
                        humanMove = in.nextInt(); 
                    }
                }
                else {
                    while (humanMove != 1){
                        humanMove = in.nextInt();
                    }
                }
            sticks = initialSticks - humanMove;
            System.out.println("round " + roundCount + ": " + initialSticks + " at start human takes " + humanMove + ", so " + sticks + " remain");
            initialSticks = sticks;
            roundCount = roundCount + 1; 
            }
            else if (roundCount % 2 == 1){
                int computerMove = 0;
                if (initialSticks > 1){
                    computerMove = (int)(Math.random() * 2) + 1;
                }
                else {
                    computerMove = 1;
                }
                sticks = sticks - computerMove;
                System.out.println("round " + roundCount + ": " + initialSticks + " at start computer takes " + computerMove + ", so " + sticks + " remain");
                initialSticks = sticks;
                roundCount = roundCount + 1;
            }
        }
        
        if (roundCount % 2 == 1){
            System.out.println("You win / computer loses!");
        } 
        else {
            System.out.println("You lose / computer wins!");
        }
        
        in.close();
    }

}
