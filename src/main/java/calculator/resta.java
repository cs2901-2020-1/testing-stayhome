package calculator;

public class resta implements calculate {
        @Override
        public double calculate(double ... args){
                double res = 0;
                for (double i: args) res -= i;

                System.out.println(res);
                return res;
        }
}
