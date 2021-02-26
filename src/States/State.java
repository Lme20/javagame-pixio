package States;

import MainGame.Game;

import java.awt.*;

public abstract class State {

    private static State currentState = null;

    public static void setState(State state){
        currentState = state;
    }

    public static State getState(){
        return currentState;
    }

    protected Game game;

    public State(Game game){
        this.game = game;
    }



    //Unrelated
    public abstract void update();

    public abstract void render(Graphics g);

}
