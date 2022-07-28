package Tiles;

import Graphics.Assets;

public class DirtTile extends Tile{
    public DirtTile(int id) {
        super(Assets.stone, id);
    }

    //If Tile is solid or not, DEFAULT = false
    @Override
    public boolean isSolid(){
        return true;
    }
}
