package States;

import java.awt.*;

import Entity.Creatures.Player;
import Graphics.Assets;

public class GameState extends State {

    private Player player;

    public GameState(){
        player = new Player(100 , 100);

    }

    @Override
    public void update() {
        player.update();

    }

    @Override
    public void render(Graphics g) {
        //g.drawImage(Assets.house, 0, 0, null);
        player.render(g);

    }
}
