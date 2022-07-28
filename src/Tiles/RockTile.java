package Tiles;

import Graphics.Assets;


public class RockTile extends Tile{
    public RockTile(int id) {
        super(Assets.bigStone, id);
    }

    //If Tile is solid or not, DEFAULT = false
    @Override
    public boolean isSolid(){
        return true;
    }
}
