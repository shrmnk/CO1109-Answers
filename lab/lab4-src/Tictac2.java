/*
Lab 4 Question 15
*/
import java.util.Scanner;
import java.util.Random;

class Tictac2 {
    static final int LINE_LENGTH = 7;
    static final char LINE_VERTICAL_CHAR = '|';
    static final char LINE_HORIZONTAL_CHAR = '-';
    static final char[] CHAR_MARKINGS = {' ', 'X', 'O'};
    static final char CHAR_O = 'O';
    static final int AI_PLAYER = 1;

    static Random r = new Random();

    static final int[][] INITIAL_MARKINGS = {
        {0, 0, 0},
        {0, 0, 0},
        {0, 0, 0}
    };

    static int[] generateRandomMove(int[][] markings) {
        int[] ret = { r.nextInt(3), r.nextInt(3) };
        while(markings[ret[0]][ret[1]] != 0) {
            ret[0] = r.nextInt(3);
            ret[1] = r.nextInt(3);
        }
        return ret;
    }

    public static void main(String[] args) {
        int[][] currentMarkings = INITIAL_MARKINGS;
        int currentPlayer = 1;
        String input = "";
        String[] inputCoordinates = new String[2];
        int[] finalCoordinates = new int[2];
        int winner = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("To play, enter coordinates in row,column format relative to the top left.");

        printGrid(currentMarkings);
        while(winner == 0 && !isBoardFilled(currentMarkings)) {
            input = "";
            currentPlayer = currentPlayer == 1 ? 2 : 1;
            System.out.println();

            // AI appears here
            if(currentPlayer == AI_PLAYER) {
                int[] coordinatesAI = generateRandomMove(currentMarkings);
                currentMarkings[coordinatesAI[0]][coordinatesAI[1]] = AI_PLAYER;
                System.out.println("AI PLAYER Played: " + coordinatesAI[0] + "," + coordinatesAI[1]);
            } else while(input.isEmpty()) {
                System.out.print("Player " + CHAR_MARKINGS[currentPlayer] + " Move: ");
                input = in.nextLine();
                if(input.length() != 3) { input = ""; System.out.println("Bad length. Please enter coordinates in row,column format. e.g. 1,2 to place your mark in the top of the middle column."); }
                else {
                    inputCoordinates = input.split(",", 2);
                    try {
                        finalCoordinates[0] = Integer.parseInt(inputCoordinates[0].trim()) - 1;
                        finalCoordinates[1] = Integer.parseInt(inputCoordinates[1].trim()) - 1;
                    } catch(Exception e) {
                        input = "";
                        System.out.println("Sorry, did not understand " + inputCoordinates[0] + "," + inputCoordinates[1]);
                        System.out.println("Please enter coordinates in row,column format. e.g. 1,2 to place your mark in the top of the middle column.");
                        continue;
                    }
                    if(finalCoordinates[0] < 0 || finalCoordinates[0] > 2 || finalCoordinates[1] < 0 || finalCoordinates[1] > 2) {
                        input = "";
                        System.out.println("Sorry, your coordinates are out of range!");
                    } else if(currentMarkings[finalCoordinates[0]][finalCoordinates[1]] == 0) currentMarkings[finalCoordinates[0]][finalCoordinates[1]] = currentPlayer;
                    else {
                        input = "";
                        System.out.println("Sorry, that spot is currently taken by Player " + CHAR_MARKINGS[currentMarkings[finalCoordinates[0]][finalCoordinates[1]]]);
                    }
                }
            }
            printGrid(currentMarkings);
            winner = getWinner(currentMarkings);
        }

        System.out.println("GAME OVER!");
        if(!isBoardFilled(currentMarkings))
            System.out.println("Winner: Player " + CHAR_MARKINGS[winner]);
        else
            System.out.println("DRAW!");
    }

    static int getWinner(int[][] markings) {
        for(int currentCheck = 1; currentCheck <= 2; currentCheck++) {
            // Check horizontal win
            for(int row = 0; row < 3; row++)
                if(markings[row][0] == currentCheck && markings[row][0] == markings[row][1] && markings[row][1] == markings[row][2]) return currentCheck;

            // Check vertical win
            for(int column = 0; column < 3; column++)
                if(markings[0][column] == currentCheck && markings[0][column] == markings[1][column] && markings[1][column] == markings[2][column]) return currentCheck;

            // Check diagonal win - NW to SE
            if(markings[0][0] == currentCheck && markings[1][1] == currentCheck && markings[2][2] == currentCheck) return currentCheck;

            // Check diagonal win - NE to SW
            if(markings[0][2] == currentCheck && markings[1][1] == currentCheck && markings[2][0] == currentCheck) return currentCheck;
        }

        return 0;
    }

    static boolean isBoardFilled(int[][] markings) {
        for(int row = 0; row < 3; row++)
            for(int col = 0; col < 3; col++)
                if(markings[row][col] == 0) return false;
        return true;
    }

    static void printGrid(int[][] markings) {
        int i = 0;
        for(i = 0; i < LINE_LENGTH; i++) System.out.print(LINE_HORIZONTAL_CHAR);
        System.out.println();
        for(int row = 0; row < 3; row++) {
            int column = 0;
            for(i = 0; i < LINE_LENGTH; i++) {
                if(i % 2 == 1) {
                    System.out.print(CHAR_MARKINGS[markings[row][column]]);
                    column++;
                }
                else System.out.print(LINE_VERTICAL_CHAR);
            }
            System.out.println();
            for(i = 0; i < LINE_LENGTH; i++) System.out.print(LINE_HORIZONTAL_CHAR);
            System.out.println();
        }
    }
}
