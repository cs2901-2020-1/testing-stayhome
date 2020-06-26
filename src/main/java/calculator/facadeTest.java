package calculator;

import java.io.*;

public class facadeTest{
	public static void main(String[] args){
		facade Facade = new facade();

		//para suma 
		Facade.doSuma(9.5,0.5,5.0);//15

		//para resta
		//Facade.doResta(10.0,5.5);

		//para mult
		//Facade.doMult(2.0,2.0);

		//para div
		//Facade.doDiv(10.0,5.0);
	}
}
