package States;

import java.awt.*;

import Entity.Creatures.Player;
import Graphics.Assets;
import MainGame.Game;
import Tiles.Tile;

//HERE LAYS THE GAME PANEL, ANYTHING VISIBLE IS ADDED HERE
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
    //render player and tiles, objects
    public void render(Graphics g) {
        //g.drawImage(Assets.house, 0, 0, null);
        player.render(g);
        Tile.tiles[0].render(g, 0 ,0);

    }
}
