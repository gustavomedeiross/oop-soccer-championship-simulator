package factories;

import entities.DefenderPlayer;
import entities.ForwardPlayer;
import entities.GoalkeeperPlayer;
import entities.Player;

public class PlayerFactoryImpl implements PlayerFactory {
    public Player makePlayer() {
        return new GoalkeeperPlayer();
    }

    @Override
    public Player makePlayer(PlayerType type) throws Exception {
        switch (type) {
            case GOALKEEPER:
                return new GoalkeeperPlayer();
            case DEFENDER:
                return new DefenderPlayer();
            case FORWARD:
                return new ForwardPlayer();
            default:
                throw new Exception();
        }
    }
}
