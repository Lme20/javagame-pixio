package States;

import java.awt.*;

import Entity.Creatures.Player;
import Graphics.Assets;
import MainGame.Game;
import MainGame.tiles.Tile;

public class GameState extends State {

    private Player player;

    public GameState(Game game){
        super(game);
        player = new Player(game,100 , 100);

    }

    @Override
    public void update() {
        player.update();

    }

    @Override
    public void render(Graphics g) {
        //g.drawImage(Assets.house, 0, 0, null);
        player.render(g);

        //rendering Tiles
        Tile.tiles[0].render(g, 0,0 );

    }
}
