package dz3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int newMax) {
        maxPlayers = newMax;
    }

    void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        } else {
            System.out.println("Достигнуто максимальное количество игроков.");
        }
    }

    void printGameStatus() {
        System.out.println("Игра: " + gameName + ", Текущие игроки: " + currentPlayers + ", Максимум: " + maxPlayers);
    }
}