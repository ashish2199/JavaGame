package javagame;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;
//creates a simple screen
public class Menu extends BasicGameState{
	//create a simple screen or stare
	
	public String mouse = "No Input yet";
	
	Image face;
	Image exitGame;
	Image playNow;
	
	int faceX = 200;
	int faceY = 200;
	//constructor
	public Menu(int state){
	}
	
	//housekeeping stuff
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
	
	face = new Image("res/ball.png");
	playNow = new Image("res/playNow.png");
	exitGame = new Image("res/exitGame.png");
	
	}
	
	//draw stuff on screen   
	//graphic object g is like the paintbrush to draw stuff
	public void render(GameContainer gc, StateBasedGame sbg,Graphics g) throws SlickException{
		
		//mouse pointer coordinates displayer
		g.drawString(mouse, 10, 10);
		
		//g.fillOval(75, 75, 100, 100);
		//g.drawString("Play Now!", 80, 60);
		
		playNow.draw(100, 100);
		exitGame.draw(100,200);
		
		//keyboard input based image
		//g.drawImage(face, faceX, faceY);
		
		// to show a message at 50,50
		//g.drawString("Are you ready to blast some Ham!! ??", 50, 50);
				
		// draw a rectangle at 50,100  with properties width:60 and height:120
		//g.drawRect(50, 100, 60, 120);
		// draw oval at 200,130 with width 130 and height 80
		//g.drawOval(200, 130, 130, 80);
		//create a image object use png format
		//Image ball = new Image("res/ball.png");
		//draw that image on screen 
		//g.drawImage(ball, 200, 130);
		
		
	}
	
	//updates the images on screen  
	//when things change
	public void update(GameContainer gc, StateBasedGame sbg,int delta) throws SlickException{
		
		Input input = gc.getInput();
				
		
		//in this library origin at bottom left 
		int xpos = Mouse.getX();
		int ypos = Mouse.getY(); 
		mouse = "Mouse Position X: "+xpos+" Y: "+ypos;
		
		
		//check for cursor position if it is inside the circle
		//if( (xpos>100&&xpos<311) && (ypos>209 && ypos<260) ){
			// check for cick 0 is left click and 1 is right click
			//if(input.isMouseButtonDown(0)){
				//sbg.enterState(1);
			//}
		//}
		
		
		if( (xpos>100&&xpos<311) && (ypos>109 && ypos<160) ){
			// check for cick 0 is left click and 1 is right click
			if(input.isMouseButtonDown(0)){
				System.exit(0);
			}
		}
		
		
		if( (xpos>75&&xpos<175) && (ypos>160 && ypos<260) ){
			// check for cick 0 is left click and 1 is right click
			if(input.isMouseButtonDown(0)){
				sbg.enterState(1);
			}
		}
		
		// getting keyboard imput
		
		//if(input.isKeyDown(Input.KEY_UP))	{ faceY -= 1; }
		//if(input.isKeyDown(Input.KEY_DOWN))	{ faceY += 1; }
		//if(input.isKeyDown(Input.KEY_LEFT))	{ faceX -= 1; }
		//if(input.isKeyDown(Input.KEY_RIGHT)){ faceX += 1; }
	
	}
	
	//returns ID of state
	public int getID(){
	return 0;
	}
}
