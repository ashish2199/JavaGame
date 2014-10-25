package javagame;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState{
	
	//create a simple screen or stare
	// 4 different animation 
	Animation bucky,movingUp,movingDown,movingLeft,movingRight;
	Image worldMap;
	boolean quit = false ;
	
	//how long animation will last how long each image will last 200ms 
	int[] duration = {200,200};
	
	float buckyPositionX = 0;
	float buckyPositionY = 0;
	
	// shift map not the player
	float shiftX = buckyPositionX+320;
	float shiftY = buckyPositionY+160;
	
	
	//constructor
	public Play(int state){
			
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		worldMap = new Image("res/world.png");
		//image array for animation 
		Image[] walkUp = {new Image("res/buckysBack.png"),new Image("res/buckysBack.png") };
		Image[] walkDown = {new Image("res/buckysFront.png"),new Image("res/buckysFront.png") };
		Image[] walkLeft = {new Image("res/buckysLeft.png"),new Image("res/buckysLeft.png") };
		Image[] walkRight = {new Image("res/buckysRight.png"),new Image("res/buckysRight.png") };
	
		//Animation what images we want to use how long each image will last    autoupdating 
		movingUp = new Animation(walkUp,duration,false);
		movingDown = new Animation(walkDown,duration,false);
		movingLeft = new Animation(walkLeft,duration,false);
		movingRight = new Animation(walkRight,duration,false);
		
		bucky = movingDown;
	
	}
	
	//draw stuff on screen   graphic object is like the paintbrush to draw stuff
	public void render(GameContainer gc, StateBasedGame sbg,Graphics g) throws SlickException{
		g.drawString("Buck's X: "+buckyPositionX+" Y "+buckyPositionY, 400,20);
		worldMap.draw(buckyPositionX, buckyPositionY);
		bucky.draw(shiftX,shiftY);
		
		if(quit==true){
			g.drawString("Resume (R)", 250, 100);
			g.drawString("Main Menu (M)", 250, 150);
			g.drawString("Quit game (Q)", 250, 200);
			if(quit == true){
				g.clear();
			} 
		}
	}
	
	//updates the images on screen  
	public void update(GameContainer gc, StateBasedGame sbg,int delta) throws SlickException{
	
	Input input = gc.getInput();	
	//UP 	
	if (input.isKeyDown(Input.KEY_UP)){
			bucky=movingUp;
			buckyPositionY += delta * .1f;
			if(buckyPositionY>162){
				buckyPositionY -= delta * .1f;
			}
			
		}
	
		//Down
		if (input.isKeyDown(Input.KEY_DOWN)){
			bucky=movingDown;
			buckyPositionY -= delta * .1f;
			if(buckyPositionY<-600){
				buckyPositionY += delta * .1f;
			}
		}
		
		//Left
		if (input.isKeyDown(Input.KEY_LEFT)){
			bucky=movingLeft;
			buckyPositionX += delta * .1f;
			if(buckyPositionX>324){
				buckyPositionX -= delta * .1f;
			}
		}
		
		//Right 
		if (input.isKeyDown(Input.KEY_RIGHT)){
			bucky=movingRight;
			buckyPositionX -= delta * .1f;
			if(buckyPositionX<-840){
				buckyPositionX += delta * .1f;
			}
		}
		
	}
	
	public int getID(){
	return 1;
	}
	
	
}

