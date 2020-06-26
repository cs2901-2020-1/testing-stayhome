package calculator;

public class div implements calculate {
        @Override
        public double calculate(double ... args){
                double di = 0;
                for (double i: args) di /= i;

                System.out.println(di);
            return di;
        }


}

