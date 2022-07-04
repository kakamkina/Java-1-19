package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

//        int random() {
            Random r = new Random();
            int f = r.nextInt(100 - 90) + 90;
//        }

        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();
        player1.setStamina(f);
        System.out.println(player1.getStamina());


//            List<Player> playerList = new ArrayList<Player>(6);
//        for(int i = 0; i < 6; i++){
//            Player a = new Player();
//            playerList.add(a);
//            player.stamina
//
//        }
    }
}

class Player {

    int stamina;
    int players;
    static int MAX_STAMINA = 100;
    static int MIN_STAMINA = 0;


    static void countPlayers () {

    }
        int run () {
            if (stamina < 0) {
                players = players - 1; /////////////////////////
            } else {
                stamina--;
            }
            return stamina;
        }

        void info () {

            switch (players) {
                case 5:
                    System.out.println("Команды неполные. На поле еще есть " + (6 - players) + " свободное место");
                    break;
                case 4:
                case 3:
                case 2:
                    System.out.println("Команды неполные. На поле еще есть " + (6 - players) + " свободных местa");
                    break;
                case 1:
                    System.out.println("Команды неполные. На поле еще есть " + (6 - players) + " свободных мест");
                default:
                    System.out.println("На поле нет свободных мест");
            }
        }

    public void setStamina(int stamina) {
        this.stamina = stamina;
        Random r = new Random();
        int f = r.nextInt(100 - 90) + 90;
    }

    public int getStamina () {
            return stamina;
        }

        public int getPlayers () {
            return players;
        }
    }
