package MainGame.tiles;

import Graphics.Assets;

import java.awt.image.BufferedImage;

public class House2Tile extends Tile{

    public House2Tile(int id) {
        super(Assets.house2, id);
    }

    @Override
    //OVERRIDE isSolid method if true
    public boolean isSolid(){
        return true;
    }
}
