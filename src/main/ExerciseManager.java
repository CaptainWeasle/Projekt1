package main;

import java.util.Random;

import exercises.CancelExercise;
import exercises.DivisionExercise;
import exercises.Exercise;
import exercises.MentalmathExercise;
import exercises.PercentExercise;

public class ExerciseManager{
	private Exercise exercise;
	private Random rnd = new Random();
	private String[] generateBox = new String[5];
	private String[] levelBox = new String[4];
	private int currentExerciseType;
	private int lastExerciseType;
	private int level;
	
	public ExerciseManager(){
		generateBox[0] = "Zufaellig";
		generateBox[1] = "Prozent";
		generateBox[2] = "Division";
		generateBox[3] = "Kopfrechnen";
		generateBox[4] = "Kuerzen";
		levelBox[0] = "1";
		levelBox[1] = "2";
		levelBox[2] = "3";
		levelBox[3] = "4";
		
		currentExerciseType = 0;
		lastExerciseType = currentExerciseType;
		level = 1;
		
		generateExercise();
	}
	
	// takes one random type of exercise
	public void generateExercise(){
		if(currentExerciseType == 0){
			lastExerciseType = rnd.nextInt(4) + 1;
			if(lastExerciseType == 1){
				exercise = new PercentExercise(level);
			}else if(lastExerciseType == 2){
				exercise = new DivisionExercise(level);
			}else if(lastExerciseType == 3){
				exercise = new MentalmathExercise(level);
			}else if(lastExerciseType == 4){
				exercise = new CancelExercise(level);
			}
		}else if(currentExerciseType == 1){
			exercise = new PercentExercise(level);
		}else if(currentExerciseType == 2){
			exercise = new DivisionExercise(level);
		}else if(currentExerciseType == 3){
			exercise = new MentalmathExercise(level);
		}else if(currentExerciseType == 4){
			exercise = new CancelExercise(level);
		}
	}
	
	// sets the exercise type
	public void setType(int i){
		if(i < 0)	i = 0;
		if(i > 4)	i = 4;
		currentExerciseType = i;
	}
	
	// gets the exercise type
	public int getType(){
		return (currentExerciseType == 0)? lastExerciseType : currentExerciseType;
	}
	
	// sets the level type
	public void setLevel(int level){
		if(level > 3)	level = 3;
		if(level < 0)	level = 0;
		this.level = level + 1;
	}
	
	// gets the list of exercises as String array
	public String[] getExerciseList(){
		return generateBox;
	}
	
	// gets the list of levels as String array
	public String[] getLevelList(){
		return levelBox;
	}
	
	// returns answer of exercise
	public float getAnswer(){
		return exercise.getAnswer();
	}
	
	// returns question of exercise
	public String getQuestion(){
		return exercise.getQuestion();
	}
}