package MainGame.tiles;

import Graphics.Assets;

import java.awt.image.BufferedImage;

public class BigStoneTile extends Tile{

    public BigStoneTile(int id) {
        super(Assets.bigStone, id);
    }

    @Override
    //OVERRIDE isSolid method if true
    public boolean isSolid(){
        return true;
    }
}
