package MainGame.tiles;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {

    //STATIC THINGY

    public static Tile[] tiles = new Tile[256];
    public static Tile grassTile = new GrassTile(0);
    public static Tile BigStoneTile = new BigStoneTile(1);
    public static Tile House2Tile = new House2Tile(2);
    public static Tile HouseTile = new HouseTile(3);
    public static Tile RockTile = new RockTile(4);

    //CLASS

    public static final int TILEWIDTH= 64, TILEHEIGHT= 64;

    protected BufferedImage texture;
    protected final int id;

    public Tile(BufferedImage texture, int id){
        this.texture = texture;
        this.id = id;

        tiles[id] = this;
    }

    //to update tile, ALWAYS ADD UPDATE METHOD!!!!
    public void update(){

    }

    public void render(Graphics g, int x, int y){
        g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
    }

    public boolean isSolid(){
        return false;
    }

    public int getId(){
        return id;
    }
}
