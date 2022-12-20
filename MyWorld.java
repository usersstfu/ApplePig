import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        //Method Mennetukan Besarnya Dari World Yang Dibuat
        super(800, 400, 1); 
        prepare();
    }
    public void act(){
        //Prosedur Membuat Apel Respawn Secara Random Di World
        if(Greenfoot.getRandomNumber(78)<1){
            addObject(new apel(),Greenfoot.getRandomNumber(800)+0,300);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    //Prosedur Penempatan Tiap Objek Pada World
    {
        babi babi = new babi();
        addObject(babi,47,191);
        apel apel = new apel();
        addObject(apel,115,50);
        apel apel2 = new apel();
        addObject(apel2,185,351);
        apel apel3 = new apel();
        addObject(apel3,299,58);
        apel apel4 = new apel();
        addObject(apel4,285,201);
        apel apel5 = new apel();
        addObject(apel5,450,311);
        landak landak = new landak();
        addObject(landak,547,65);
        apel5.setLocation(441,229);
        apel apel6 = new apel();
        addObject(apel6,479,343);
        apel apel7 = new apel();
        addObject(apel7,350,346);
        apel apel8 = new apel();
        addObject(apel8,426,50);
        apel4.setLocation(302,153);
        landak.setLocation(541,75);
        babi.setLocation(52,166);
        landak landak2 = new landak();
        addObject(landak2,66,283);
        apel apel9 = new apel();
        addObject(apel9,544,174);
        apel apel10 = new apel();
        addObject(apel10,621,259);
        landak.setLocation(702,59);
        landak2.setLocation(63,315);
        apel apel11 = new apel();
        addObject(apel11,582,69);
        apel apel12 = new apel();
        addObject(apel12,725,138);
        apel apel13 = new apel();
        addObject(apel13,687,337);
        landak landak3 = new landak();
        addObject(landak3,425,177);
        landak2.setLocation(84,306);
    }
}
