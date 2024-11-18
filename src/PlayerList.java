// repository of all the players in escape room

import java.util.ArrayList;

public class PlayerList {
    public ArrayList<Player> players = new ArrayList<>();

    public void addPlayer(String name, String phoneNum, String email, String password) {
        players.add(new Player(name, phoneNum, email, password));
    }

    public boolean phoneNuminSystem(String phoneNum) {
        for (Player player : players) {
            if (player.getPhoneNum().equals(phoneNum)) {
                return true;
            }
        }
        return false;
    }
    public boolean emailinSystem(String email) {
        for (Player player : players) {
            if (player.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
    public String getName(int id){
        for (Player player : players){
            if (player.getId() == id){
                return player.getName();
            }
        }
        return null;
    }
    public boolean validPayment(int id){
        for (Player player : players){
            if (player.getId() == id){
                return player.validPayment;
            }
        }
        return false;
    }
    public int getID(String email){
        for (Player player : players){
            if (player.getEmail().equals(email)){
                return player.getId();
            }
        }
        System.out.println("Email not found!");
        return -1;
    }
}