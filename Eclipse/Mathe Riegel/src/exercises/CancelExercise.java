package exercises;

public class CancelExercise extends Exercise{
	
	public CancelExercise(int level){
		super(level);
	}
	
	@Override
	protected void generateExercise(){
		if(level == 1){
			component1 = getRandomInt(9) + 1;
			component2 = getRandomInt((int)component1 - 1) + 1;
			answer = getGGT((int)component1, (int)component2);
		}else if(level == 2){
			component1 = getRandomInt(19) + 1;
			component2 = getRandomInt((int)component1 - 1) + 1;
			if(getGGT((int)component1, (int)component2) != 1){
				answer = getGGT((int)component1, (int)component2);
			}else{
				float tmp = (float)(getRandomInt(9) + 1);
				component1 *= tmp;
				component2 *= tmp;
				answer = getGGT((int)component1, (int)component2);
			}
		}else if(level == 3){
			component1 = getRandomInt(99) + 1;
			component2 = getRandomInt((int)component1 - 1) + 1;
			if(getGGT((int)component1, (int)component2) != 1){
				answer = getGGT((int)component1, (int)component2);
			}else{
				float tmp = (float)(getRandomInt(9) + 1);
				component1 *= tmp;
				component2 *= tmp;
				answer = getGGT((int)component1, (int)component2);
			}
		}else if(level == 4){
			component1 = getRandomInt(999) + 1;
			component2 = getRandomInt((int)component1 - 1) + 1;
			if(getGGT((int)component1, (int)component2) != 1){
				answer = getGGT((int)component1, (int)component2);
			}else{
				float tmp = (float)(getRandomInt(9) + 1);
				component1 *= tmp;
				component2 *= tmp;
				answer = getGGT((int)component1, (int)component2);
			}
		}
	}
	
	@Override
	public String getQuestion(){
		return "Ggt von: " + component1 + " / " + component2;
	}
	
	private float getGGT(int a, int b){
		while(b != 0){
			if(a > b){
				a = a - b;
			}else{
				b = b - a;
			}
		}
		return (float)a;
	}
}