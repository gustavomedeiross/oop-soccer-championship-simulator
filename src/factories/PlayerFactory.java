package factories;

import entities.Player;

enum PlayerType {
    DEFENDER,
    FORWARD,
    GOALKEEPER
}

public interface PlayerFactory {
    public Player makePlayer(PlayerType type) throws Exception;
}
