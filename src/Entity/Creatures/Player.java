package Entity.Creatures;

import java.awt.*;
import Graphics.Assets;
import MainGame.Game;


public class Player extends Creature {

    private Game game;

    public Player(Game game, float x, float y) {
        super(x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
        this.game = game;
    }

    @Override
    public void update() { //if up then subtract, if down then add
        getInput();
        move();

    }

    private void getInput(){
        xMove = 0;
        yMove = 0;

        if(game.getKeyManager().up)
            yMove = -speed;
        if(game.getKeyManager().down)
            yMove = +speed;
        if(game.getKeyManager().left)
            xMove = -speed;
        if(game.getKeyManager().right)
            xMove = +speed;
    }

    @Override
    public void render(Graphics g) {

        g.drawImage(Assets.player, (int) x, (int) y, width, height, null);

    }
}
