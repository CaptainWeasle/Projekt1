package exercises;

import java.util.Random;

public abstract class Exercise{
	protected float component1;
	protected float component2;
	protected float answer;
	protected int level;
	
	private Random rnd = new Random();
	
	public Exercise(){
		level = getRandomInt(4) + 1;
		generateExercise();
	}
	
	public Exercise(int level){
		this.level = level;
		generateExercise();
	}
	
	// generates an exercise
	protected void generateExercise(){
		component1 = getRandomInt(10000);
		component2 = getRandomInt(10000);
		answer = component1 + component2;
	}
	
	// returns current params as a String
	public String getQuestion(){
		return component1 + " + " + component2 + " = ";
	}
	
	// returns current answer
	public float getAnswer(){
		return answer;
	}
	
	// returns random number in float
	protected float getRandomFloat(){
		return rnd.nextFloat();
	}
	
	// returns random number in int
	protected int getRandomInt(int max){
		return rnd.nextInt(max);
	}
}