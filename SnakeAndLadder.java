package Day4.asssignments.SnakeAndLadder;

public class SnakeAndLadder {
    static int PLAYER_POSITION = 0;

    static int random_value(int max) {
        int dice_number = (int) (Math.floor(Math.random() * 10) % max) + 1;
        return dice_number;
    }

    static int Calculate_snake(int dice, int player) {
        System.out.println("Snake = " + dice);
        int temp = player - dice;
        if (temp < 0) {
        } else {
            player = temp;
        }
        return player;
    }

    static int Calculate_ladder(int dice, int player) {
        System.out.println("ladder = " + dice);
        int temp = player + dice;
        if (temp <= 100) {
            player = temp;
        }
        return player;
    }

    static int Calculate_player(int player) {
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
        System.out.println("position of player is" + Calculate_player(PLAYER_POSITION));

    }
}