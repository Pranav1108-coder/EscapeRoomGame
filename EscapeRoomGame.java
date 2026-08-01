import java.util.*;

public class EscapeRoomGame {
    static Scanner sc = new Scanner(System.in);
    static int lives = 3;

    public static void main(String[] args) {
        System.out.println("=== ESCAPE ROOM GAME ===");

        if(!room1()) gameOver();
        if(!room2()) gameOver();
        if(!room3()) gameOver();
        if(!room4()) gameOver();

        System.out.println("\nExit Door Opens...");
        System.out.println("🎉 YOU ESCAPED! 🎉");
    }

    static boolean room1() {
        while(lives>0){
            try{
                System.out.print("\nRoom 1 - Guess Number (1-10): ");
                int n=sc.nextInt();
                if(n==7){ System.out.println("Correct!"); return true; }
                lives--;
                System.out.println("Wrong! Lives: "+lives);
            }catch(Exception e){
                System.out.println("Invalid input!");
                sc.nextLine();
            }
        }
        return false;
    }

    static boolean room2() {
        int[] arr={5,10,15,20};
        while(lives>0){
            try{
                System.out.print("\nRoom 2 - What is arr[2]? ");
                int ans=sc.nextInt();
                if(ans==arr[2]){ System.out.println("Correct!"); return true; }
                lives--;
                System.out.println("Wrong! Lives: "+lives);
            }catch(Exception e){
                System.out.println("Invalid input!");
                sc.nextLine();
            }
        }
        return false;
    }

    static boolean room3() {
        while(lives>0){
            System.out.print("\nRoom 3 - Reverse of 'JAVA': ");
            String s=sc.next();
            if(s.equalsIgnoreCase("AVAJ")){
                System.out.println("Correct!");
                return true;
            }
            lives--;
            System.out.println("Wrong! Lives: "+lives);
        }
        return false;
    }

    static boolean room4() {
        while(lives>0){
            try{
                System.out.println("\nRoom 4 - Java MCQ");
                System.out.println("Which keyword is used for inheritance?");
                System.out.println("1. this\n2. extends\n3. implements\n4. super");
                System.out.print("Answer: ");
                int c=sc.nextInt();
                if(c==2){
                    System.out.println("Correct!");
                    return true;
                }
                lives--;
                System.out.println("Wrong! Lives: "+lives);
            }catch(Exception e){
                System.out.println("Invalid input!");
                sc.nextLine();
            }
        }
        return false;
    }

    static void gameOver(){
        System.out.println("\nGame Over! You lost all lives.");
        System.exit(0);
    }
}
