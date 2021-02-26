package Entity.Creatures;

import java.awt.*;
import Graphics.Assets;
import MainGame.Game;


public class Player extends Creature {

    private Game game;

    public Player(Game game, float x, float y) {
        super(x, y);
        this.game = game;
    }

    @Override
    public void update() { //if up then subtract, if down then add
        if(game.getKeyManager().up)
            y -= 3; // Y axis increases as it goes down, subtract from Y-position
        if(game.getKeyManager().down)
            y += 3; // Y axis increases as it goes down, add from Y-position
        if(game.getKeyManager().right)
            x += 3; // X axis increases as it goes right, add from X-position
        if(game.getKeyManager().left)
            x -= 3; // X axis increases as it goes left, subtract from X-position
    }

    @Override
    public void render(Graphics g) {

        g.drawImage(Assets.player, (int) x, (int) y, null);

    }
}
