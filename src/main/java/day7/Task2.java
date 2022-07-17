package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random r = new Random();
        int randomStamina = r.nextInt(100 - 90) + 90;

        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();

        player1.setStamina(randomStamina);
        player2.setStamina(randomStamina);
        player3.setStamina(randomStamina);
        player4.setStamina(randomStamina);
        player5.setStamina(randomStamina);
        player6.setStamina(randomStamina);

        player1.info();
        System.out.println("Текущее количество игроков на поле: " + Player.countPlayers);
        player1.run();
        System.out.println("Текущее количество игроков на поле: " + Player.countPlayers);
        player1.info();
    }
}

class Player {

    int stamina;
    int players;
    static int countPlayers;
    static int MAX_STAMINA = 100;
    static int MIN_STAMINA = 0;


    Player() {
        if (countPlayers < 6) {
            countPlayers++;
        } else {
            System.out.println("На поле максимальное количество игроков. Добавление нового невозможно.");
        }
    }

    int run() {
        for (; ; ) {
            if (stamina == 0) {
                countPlayers = countPlayers - 1;
            } else {
                stamina--;
                continue;
            }
            return stamina;
        }
    }

    public void info() {

        switch (countPlayers) {
            case 5:
                System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободное место.");
                break;
            case 4:
            case 3:
            case 2:
                System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных местa.");
                break;
            case 1:
                System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест.");
            default:
                System.out.println("На поле нет свободных мест.");
        }
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
        Random r = new Random();
        int f = r.nextInt(100 - 90) + 90;
    }

    public int getStamina() {
        return stamina;
    }

    public int getPlayers() {
        return players;
    }
}
