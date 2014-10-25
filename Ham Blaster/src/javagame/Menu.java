package javagame;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;
//creates a simple screen
public class Menu extends BasicGameState{
	
	//create a simple screen or stare
	
	public String mouse = "No Input yet";
	
	//constructor
	public Menu(int state){
		
		
	}
	
	//housekeeping stuff
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		
	}
	
	//draw stuff on screen   
	//graphic object g is like the paintbrush to draw stuff
	public void render(GameContainer gc, StateBasedGame sbg,Graphics g) throws SlickException{
		// to show a message at 50,50
		//g.drawString("Are you ready to blast some Ham!! ??", 50, 50);
		
		g.drawString(mouse, 50, 50);
		
		// draw a rectangle at 50,100  with properties width:60 and height:120
		g.drawRect(50, 100, 60, 120);
		
		// draw oval at 200,130 with width 130 and height 80
		//g.drawOval(200, 130, 130, 80);
		
		//create a image object use png format
		Image ball = new Image("res/ball.png");
		//draw that image on screen 
		g.drawImage(ball, 200, 130);
		
		
	}
	
	//updates the images on screen  
	//when things change
	public void update(GameContainer gc, StateBasedGame sbg,int delta) throws SlickException{
		//in this library origin at bottom left 
		int xpos = Mouse.getX();
		int ypos = Mouse.getY(); 
		mouse = "Mouse Position X: "+xpos+" Y: "+ypos;
	}
	//returns ID of state
	public int getID(){
	return 0;
	}
}
