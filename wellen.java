
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse wellen.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class wellen extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,500);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
       background(255, 153, 0);
       zeichneReihe(0, true,true);
       zeichneReihe(54, false,true);
       zeichneReihe(108, true,true);
       zeichneReihe(162, false,false);
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }
    public void zeichneReihe(int y, boolean links, boolean unterstrich){
        
        int test[]  = {0,1,0,1,0,1,0,1};//da fällt mir noch nichts besseres ein :(
        
    for(int k = 0;k<8;k++){
        zeichneQuadrat(50*k+50, y+50, test[k],links);
        fill(0,255,0);
        if(unterstrich == true){rect(50,y+50+51,400,3);}
        
    }
    }
    public void zeichneQuadrat(int x, int y, int farbe, boolean links){
        if(farbe == 1)
        {
         fill(0,0,0);
        
        rect(x,y,50,50);
        fill(255);
        if(links == true){
        circle(x+5,y+5,5);
        circle(x+5,y+45,5);
        }
        else{
        
        circle(x+45,y+5,5);
        circle(x+45,y+45,5);
        }
        }
        
        else{
            fill(255);
        rect(x,y,50,50);
        fill(1);
        if(links == true){
         
        circle(x+5,y+5,5);
        circle(x+5,y+45,5);
        }
        else{
        circle(x+45,y+5,5);
        circle(x+45,y+45,5);
        }
        }
    }
    
        /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {wellen.class.getName() });
    }

}
