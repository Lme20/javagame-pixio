package Graphics;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 128, height = 128;

    public static BufferedImage house, grassTile, grass, stone, bigStone, house2, tree, player;

    public static void init() {
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sprite_sheet.png"));

        house = sheet.crop(0,0,width,height);
        grassTile = sheet.crop(width,0,width,height);
        grass = sheet.crop(width*2,0,width,height);
        stone = sheet.crop(width*3, 0, width, height);
        bigStone = sheet.crop(width*4, 0, width, height);
        house2 = sheet.crop(width*5, 0, width, height);
        tree = sheet.crop(width*6, 0, width, height);
        player = sheet.crop(width*7, 0, width, height);


    }
}
