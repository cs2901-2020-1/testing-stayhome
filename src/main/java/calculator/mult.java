package calculator;

public class mult implements calculate {
	@Override
        public double calculate(double ... args){
                double mu = 0;
                for (double i: args) mu *= i;

                System.out.println(mu);
        return mu;
    }

}
