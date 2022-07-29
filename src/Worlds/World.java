package Worlds;

import Tiles.Tile;

import java.awt.*;

public class World {

    private int width, height;
    private int [][] tiles; //multi dimensional array

    public World(String path){
        loadWorld(path);
    }

    //update world
    public void update(){

    }

    //render world
    public void render(Graphics g){
        for(int y = 0; y < height;y++){
            for(int x = 0; x < width;x++){
                getTile(x, y).render(g, x * Tile.tileWidth, y * Tile.tileHeight);
            }
        }
    }

    public Tile getTile(int x, int y){
        Tile t = Tile.tiles[tiles[x][y]];

        if(t == null)
            return Tile.dirtTile;
        return t;
    }

    private void loadWorld(String path){


    }

}
