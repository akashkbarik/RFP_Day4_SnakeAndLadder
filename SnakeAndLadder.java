package Day4.asssignments.SnakeAndLadder;

public class SnakeAndLadder {
    static int PLAYER1_POSITION = 0;
    static int PLAYER2_POSITION = 0;
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
//        play again
        System.out.println("its a ladder! player will play again");
        System.out.println("ladder = " + dice);
        int temp2 = player + dice;
        player = temp2;
        if (temp2 <= 100) {
            player = temp;
        } else if (temp2 > 100) {
            player=temp2-dice;
            System.out.println("oops! its " + temp2 + " you cant go ahead. 100 is your dead end .");
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
        while (PLAYER1_POSITION < 100 && PLAYER2_POSITION < 100) {
            System.out.println("......................\nPlayer1 is playing now..\n.......................");
            PLAYER1_POSITION = Calculate_player(PLAYER1_POSITION);
            System.out.println("total points of player1 : " + PLAYER1_POSITION);
            count += 1;

            System.out.println("......................\nPlayer2 is playing now..\n.......................");
            PLAYER2_POSITION = Calculate_player(PLAYER2_POSITION);
            System.out.println("total points of player2 : " + PLAYER2_POSITION);
            count += 1;

        }
        if (PLAYER1_POSITION == 100) {
            System.out.println("Player1 won the game");
        } else if (PLAYER2_POSITION == 100) {
            System.out.println("player2 won the game");
        }
        System.out.println("total number of time dice was rolled : " + count);
    }
}