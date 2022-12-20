import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class babi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class babi extends Actor
{
    /**
     * Act - do whatever the babi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Pendeklarisan Prosedur Makan Apel Dengan Type Data Integer
    int makanapel = 0;
    public void act()
    {
        //Method Pergerakan Dari Objek Babi Menggunakan Key Keyboard
        if(Greenfoot.isKeyDown("UP")){
            setLocation(getX(),getY()-2);
        }
        if(Greenfoot.isKeyDown("DOWN")){
            setLocation(getX(),getY()+2);
        }
        if(Greenfoot.isKeyDown("LEFT")){
            setLocation(getX()-2,getY());
        }
        if(Greenfoot.isKeyDown("RIGHT")){
            setLocation(getX()+2,getY());
        }
        if(isTouching(landak.class)){
        //Prosedur Jika Objek Babi Mendekati Objek Landak
            gameover gameover = new gameover();
            getWorld().addObject(gameover, getWorld(). getWidth()/2, getWorld(). getWidth()/4);
            //Method Memainkan Suara
            Greenfoot.playSound("death.wav");
            //Method Greenfoot Akan Berhenti
            Greenfoot.stop();
        }
        //Pemanggilan Tiap Tiap Prosedur
        makanapel(); 
        //Method MMenampilkan Score
        getWorld().showText("Score: "+makanapel,100,50);
    }
    public void makanapel(){
    //Method Seolah Objek Apel Mneghilang jika Mendekati Objek Babi
    Actor getapel =getOneIntersectingObject(apel.class);
        if(getapel !=null){
            getWorld().removeObject(getapel);
            Greenfoot.playSound("ping.mp3");
            makanapel++;
        }
            
        }
    }
        
 
    
        
