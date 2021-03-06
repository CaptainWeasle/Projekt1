package exercises;

public class DivisionExercise extends Exercise{

	public DivisionExercise(int level){
		super(level);
	}

	//generates an Exercise
	@Override
	protected void generateExercise(){
		if(level == 1){
			component1 = getRandomInt(11) + 1;	//von 1 - 10
			answer = getRandomInt(11);
			component2 = component1 * answer;
		}else if(level == 2){
			component1 = getRandomInt(11) + 1; //von 10-20
			answer = getRandomInt(11)+10; 
			component2 = component1 * answer;
		}else if(level == 3){
			component1 = getRandomInt(11) + 1; //von 20-100
			answer = getRandomInt(81)+20;
			component2 = component1 * answer;
		}else if(level == 4){
			component1 = getRandomInt(901) + 20; //von 100-1000
			answer = getRandomInt(901)+100;
			component2 = component1 * answer;
		}
	}
	
	@Override
	public String getQuestion(){
		return "" + component2 + "/" + component1 + " = ";
	}
}