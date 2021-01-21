
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse wellen2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class wellen2 extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(700,700);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
    background(255,255,255);
    noStroke();
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {
        int modul = 0;
        boolean farbe = false;
        for(int k = 0; k<12;k++){
        modul = k%2;
        farbe = modul==1 ? true:false;
        drawCube(50+50*k,farbe);
        }
        
        noLoop();
    }
    public void drawCube(int y, boolean firstInfill){
    int modulo = 0;
    boolean Infill = false;
    
    for(int i = 0; i<12;i++){
    modulo = i % 2;
    if(firstInfill == true){ modulo = modulo == 0 ? 1:0;}
    Infill = modulo == 1 ? true:false;
    if(Infill == true){fill(0,255,0);}
    else{fill(255,255,255);}
    square(50+i*50, y, 50);//outsideCube
    
    
    if(Infill == false){fill(0,255,0);}
    else{fill(255,255,255);}
    square(55+i*50, y+5, 40);
    }
    
    }
    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {wellen2.class.getName() });
    }

}
