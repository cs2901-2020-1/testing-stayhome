package calculator;

public class suma implements calculate {
        @Override
        public double calculate(double ... args){
		double sum = 0;
		System.out.flush();
		System.out.println("Calculating... ");
		for (double i: args) sum += i;

                System.out.println(sum);
            return sum;
        }






}
