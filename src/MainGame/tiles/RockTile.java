package MainGame.tiles;

import Graphics.Assets;

import java.awt.image.BufferedImage;

public class RockTile extends Tile{

    public RockTile(int id) {
        super(Assets.stone, id);
    }

    @Override
    //OVERRIDE isSolid method if true
    public boolean isSolid(){
        return true;
    }
}
