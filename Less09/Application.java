package org.example.game;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        System.out.println("1-цифры. Введите 4 неповторяющиеся цифры.");
        System.out.println("2-буквы EN. Введите 4 неповторяющиеся английские буквы в любом регистре.");
        System.out.println("3-буквы RU. Введите 4 неповторяющиеся русские буквы в любом регистре.");
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите игру");
        int num = in.nextInt();
        Game game = null;
        switch (num) {
            case 1:
                game = new NumberGame();
                break;
            case 2:
                game = new WordGame();
                break;
            case 3:
                game = new WordRussianGame();
                break;
            default:
                System.out.println("такой игры еще не существует");
        }

        int isizeWord = 4;
        int imaxTry = 3;

        game.start(isizeWord, imaxTry);

        int iCount = 0;
        String[] sResult = new String[imaxTry + 1];
        String[] sSarr = new String[imaxTry + 1];

        while (game.getGameStatus().equals(GameStatus.START)) {
            System.out.println("ваш ход");
            String answer = in.next().toUpperCase();
            Answer answerGame = game.inputAnswer(answer);
            iCount++;
            sSarr[iCount] = answer;
            sResult[iCount] = answerGame.getBulls().toString() + "Б" + answerGame.getCows().toString() + "К";
            for (int i = 1; i <= iCount; i++) {
                System.out.print(i + ". " + sSarr[i] + "  " + sResult[i]);
                System.out.println("  - найдено " + sResult[i].charAt(0) + " коров и " +
                        sResult[i].charAt(2) + " быков");
            }
        }
        System.out.println(game.getGameStatus());
        System.out.println("***** GAME OVER *****");
    }
}
