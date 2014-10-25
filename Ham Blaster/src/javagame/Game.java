package javagame;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame{
    
	
	public static final String gamename="Ham Blaster 2.0";
	public static final int menu =0; 
	public static final int play =1;
	
	public Game(String gamename){
		super(gamename); //add title
		this.addState(new Menu(menu)); //state menu added
		this.addState(new Play(play));
	}
	
	public void initStatesList(GameContainer gc) throws SlickException{
		 //gamecontainer gameloop frame rate behind the scenes things
		this.getState(menu).init(gc,this);
		this.getState(play).init(gc,this);
		this.enterState(menu); //to enter the menu state 	
		}
	
	
	
	public static void main(String[] args) {
     AppGameContainer appgc;//object create used for window for game 
     try{
    	 appgc = new AppGameContainer(new Game(gamename));
        appgc.setDisplayMode(640, 360, false);//set size of window and false because we dont want it fullscreen 
        appgc.start(); //start the window 
     }
     		catch(SlickException e){
    	 e.printStackTrace();
    	 
     }
     
     
	}

}
