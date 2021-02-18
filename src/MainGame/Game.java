package MainGame;

import Display.Display;

import Graphics.*;
import States.GameState;
import States.MenuState;
import States.SettingsState;
import States.State;

import java.awt.*;
import java.awt.image.BufferStrategy;

//Uses Threads
public class Game implements Runnable{

    private Display display;
    public int width, height;
    public String title;

    private boolean running = false;
    private Thread thread;

    private BufferStrategy bs;
    private Graphics g;

    //States
    private State gameState;
    private State menuState;
    private State settingsState;

    //Constructor
    public Game(String title, int width, int height){
        this.height = height;
        this.width = width;
        this.title = title;
    }

    //Initialize graphics
    private void init(){
        display = new Display(title, width, height);
        Assets.init();

        //Game state initialized
        gameState = new GameState();
        State.setState(gameState);

        //Menu state initialized
        menuState = new MenuState();
        State.setState(menuState);

        //Settings state initialized
        settingsState = new SettingsState();
        State.setState(settingsState);

    }

    //Renders game
    private void render(){
        bs = display.getCanvas().getBufferStrategy();
        if(bs == null){
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        //CLEAR SCREEN
        g.clearRect(0, 0,width,height);
        // GRAPHICS
        g.drawImage(Assets.house, x, 10, null);

        //STATE
        if(State.getState() != null){
            State.getState().render(g);
        }


        //END GRAPHICS
        bs.show();
        g.dispose();
    }

    int x = 0;
    //Updates game
    private void update(){
        if(State.getState() != null){
            State.getState().update();
        }

    }

    public void run(){
        init();

        int fps = 60;
        double timePerUpdate = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int update = 0;

        while(running) {
            now = System.nanoTime();
            delta += (now - lastTime) / timePerUpdate;
            timer += now - lastTime;
            lastTime = now;



            if (delta >= 1) {
                update();
                render();
                update++;
                delta--;
            }
            if(timer >= 1000000000)
                System.out.println("Updates and Frames" + update);
                update = 0;
                timer = 0;
        }
        stop();
    }

    //Starting thread
    public synchronized void start(){
        if (running)
            return;

        running = true;
        thread = new Thread(this);
        thread.start(); //Calling run method
    }
    //Stopping thread
    public synchronized void stop(){
        if (!running)
            return;

        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
