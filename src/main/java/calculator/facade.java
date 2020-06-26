package calculator;

public class facade{
	public calculate Suma;
	public calculate Resta;
	public calculate Mult;
	public calculate Div;

	public facade(){
		Suma = new suma();
		Resta = new resta();
		Mult = new mult();
		Div = new div();
	}


	public double doSuma(double ... args){
		System.out.println("Entering sum... ");
		return Suma.calculate(args);
	}

	public void doResta(double ... args){
		Resta.calculate(args);
	}

	public void doMult(double ... args){
		Mult.calculate(args);
	}

	public void doDiv(double ... args){
		Div.calculate(args);
	}
}
