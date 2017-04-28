package exercises;

public class MentalmathExercise extends Exercise{

	public MentalmathExercise(int level){
		super(level);
	}

	@Override
	protected void generateExercise(){
		if(level == 1){
			component1 = getRandomInt(11);
			component2 = getRandomInt(11);
			answer = component1 * component2;
		}else if(level == 2){
			component1 = getRandomInt(21);
			component2 = getRandomInt(21);
			answer = component1 * component2;
		}else if(level == 3){
			component1 = getRandomInt(100)+1;
			component2 = getRandomInt(100)+1;
			answer = component1 * component2;
		}else if(level == 4){
			component1 = getRandomInt(999)+1;
			component2 = getRandomInt(999)+1;
			answer = component1 * component2;
		}
	}

	@Override
	public String getQuestion(){
		return "" + component1 + " * " + component2;
	}
}