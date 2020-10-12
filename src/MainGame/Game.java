package MainGame;

import Display.Display;
import Graphics.ImageLoader;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

//Uses Threads
public class Game implements Runnable{

    private Display display;
    public int width, height;
    public String title;

    private boolean running = false;
    private Thread thread;

    private BufferStrategy bs;
    private Graphics g;

    private BufferedImage grassTest;

    //Constructor
    public Game(String title, int width, int height){
        this.height = height;
        this.width = width;
        this.title = title;
    }

    //Initialize graphics
    private void init(){
        display = new Display(title, width, height);
        grassTest = ImageLoader.loadImage("/textures/grassTest.jpg");

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

       g.drawImage(grassTest,20, 20, null);



        //END GRAPHICS
        bs.show();
        g.dispose();
    }

    //Updates game
    private void update(){

    }

    public void run(){
        init();

        while(running){
            update();
            render();
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
