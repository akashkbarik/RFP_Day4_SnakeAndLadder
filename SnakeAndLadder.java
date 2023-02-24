package Day4.asssignments.SnakeAndLadder;

public class SnakeAndLadder {
    static int PLAYER_POSITION = 0;
    static int count;

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
        if (temp <= 100)
            player = temp;
        else if (temp > 100) {
            System.out.println("oops! its " + temp + " you cant go ahead. 100 is your dead end .");
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
        while (PLAYER_POSITION < 100) {

            PLAYER_POSITION = Calculate_player(PLAYER_POSITION);
            System.out.println("total points of player : " + PLAYER_POSITION);
            if (PLAYER_POSITION == 100) {
                System.out.println("player has won the match");
            }
            count += 1;
            System.out.println("total number of times dice was played : "+count);
        }
    }
}