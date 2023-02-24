package Day4.asssignments.SnakeAndLadder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int POSITION = 0;
        int dice_number = (int) (Math.floor(Math.random() * 10) % 6) + 1;
        System.out.println(dice_number);
    }
}