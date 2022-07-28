package Tiles;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {

    //STATIC STUFF HERE
    public static Tile[] tiles = new Tile[256]; //Tile total size
    public static Tile grassTile = new GrassTile(0); //grassTile with id 0
    public static Tile rockTile = new RockTile(2); //rockTile with id 2
    public static Tile dirtTile = new DirtTile(1); //dirtTile with id 1


    //CLASS

    protected BufferedImage texure;
    protected final int id;

    //Size variables for tile
    public static final int tileWidth = 64, tileHeight = 64;



    public Tile(BufferedImage texture, int id){
        this.texure = texture;
        this.id = id;

        tiles[id] = this; //MainTile array equal to tiles ID
        //tiles[0] = this; //Tile array equal to grassTile
        //tiles[1] = this; //Tile array equal dirtTile
        //tiles[2] = this; //Tile array equal to rockTile

    }

    //update variables of Tile
    public void update(){
    }

    //Render Tile on screen with following image
    public void render(Graphics g, int x, int y){
        g.drawImage(texure, x, y,tileWidth, tileHeight, null);

    }

    //If Tile is solid or not, DEFAULT = false
    public boolean isSolid(){
        return false;
    }

    //GETTER
    public int getId(){
        return id;
    }


}
