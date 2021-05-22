package by.epamtc.dubovik.task10;

public class FunctionArray {
	private double start;		//beginning of an interval
	private double finish;		//end of an interval
	private double step;		//step in the interval
	private FunctionInX[] arrayOfX;
	
	public FunctionArray(double start, double finish, double step) throws Exception {
		double currentStep = start;
		int length = (int)((finish - start) / step + 1);
		arrayOfX = new FunctionInX[length];
		this.start = start;
		this.finish = finish;
		this.step = step;
		
		if(finish < start) {
			throw new Exception("Invalid argument");
		}
		
		for (int i = 0; i < length; i++) {
			arrayOfX[i] = new FunctionInX(currentStep);
			currentStep += step;
		}
	}
	
	public String toString() {
		String str = new String();
		
		for (int i = 0; i < arrayOfX.length; i++) {
			str+=arrayOfX[i].toString() + "\n";
		}
		return str;
	}
}
