package src.main.java.java_basics.class_problems;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] moves = {"Rock", "Paper", "Scissors"}; // Predefined list of moves
        
        for (int i = 0; i < 5; i++) { // Repeat for N=5 rounds
            System.out.print("Your move (Rock/Paper/Scissors): ");
            String player = sc.next(); // Accept player's move
            
            int randomNum = (int) (Math.random() * 3); // Generate computer's move randomly
            String computer = moves[randomNum]; 
            
            System.out.println("Computer chose: " + computer);
            System.out.println("Result: " + checkWinner(player, computer)); // Display the winner[cite: 2]
            System.out.println("-----------------");
        }
    }

    public static String checkWinner(String p, String c) {
        if (p.equalsIgnoreCase(c)) return "Draw"; // Standard rules[cite: 2]
        if (p.equalsIgnoreCase("Rock") && c.equalsIgnoreCase("Scissors")) return "Player Wins";
        if (p.equalsIgnoreCase("Paper") && c.equalsIgnoreCase("Rock")) return "Player Wins";
        if (p.equalsIgnoreCase("Scissors") && c.equalsIgnoreCase("Paper")) return "Player Wins";
        return "Computer Wins";
    }
}
