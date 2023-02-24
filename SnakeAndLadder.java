package Day4.asssignments.SnakeAndLadder;

public class SnakeAndLadder {
    static int PLAYER_POSITION = 0;

    static int random_value(int max) {
        return (int) (Math.floor(Math.random() * 10) % max) + 1;
    }

    static int Calculate_snake(int dice, int player) {
        System.out.println("Snake = " + dice);
        int temp = player - dice;
        if (temp < 0) {
            player = 0;
        } else {
            player = temp;
        }
        return player;
    }

    static int Calculate_ladder(int dice, int player) {
        System.out.println("ladder = " + dice);
        int temp = player + dice;

        player = temp;

        return player;
    }

    static int calculate_player(int player) {
        System.out.println("current points of player = " + player);
        int dice_number = random_value(6);
        System.out.println("dice number = " + dice_number);
        int option = random_value(3);
        System.out.println("Option is : " + option);
        if (option == 1) {
            int result = Calculate_ladder(dice_number, player);
            return result;
        } else if (option == 2) {
            int result = Calculate_snake(dice_number, player);
            return result;
        } else {
            System.out.println("no play");
            return player;
        }

    }

    public static void main(String[] args) {
        while (PLAYER_POSITION < 100) {

            PLAYER_POSITION = calculate_player(PLAYER_POSITION);
            System.out.println("points of player 1 is " + PLAYER_POSITION);
            if (PLAYER_POSITION == 100) {
                System.out.println("player 1 won the match");
            }
        }
    }
}