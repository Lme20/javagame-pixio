package MainGame.tiles;

import Graphics.Assets;

import java.awt.image.BufferedImage;

public class HouseTile extends Tile{

    public HouseTile(int id) {
        super(Assets.house, id);
    }

    @Override
    //OVERRIDE isSolid method if true
    public boolean isSolid(){
        return true;
    }
}
