package States;

import java.awt.*;
import Graphics.Assets;

public class GameState extends State {

    public GameState(){

    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.house, 0, 0, null);

    }
}
