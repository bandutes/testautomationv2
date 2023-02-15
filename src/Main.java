public class Main {

    public static void main(String[] args) {

//        String miestas = "Vilnius";
//        System.out.println("miestas: " + miestas);
//
//        //_____________________________________________________________________________________
//
//        int year = 2023;
//        System.out.println("Year: " + year);
//
//        //______________________________________________________________________________________
//        int min = 0;
//        int max = 50;
//
//        int result = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println("Random number between 0 and 50: " + result);
//
//        //_______________________________________________________________________________________
//
//        int first = 20;
//        int second = 70;
//
//        int answer = min + (int) Math.round(Math.random() * (second - first));
//        System.out.println("Random number between 20 and 70: " + answer);

//        String name = "Nojus";
//        String surname = "Morkevičius";
//        int birthdate = 2003;
//        int Year = 2023;
//
//        System.out.println("Aš esu " + name + surname +"." + " Man yra " + (Year - birthdate) + " Metų" + "." );

//_________________________________________________________________________________________

//        double first = 0;
//        double second = 4;
//
//        double result = first + Math.random() * ( second - first );
//        double resultv2 = first + Math.random() * ( second - first );
//
//        if ( result < resultv2 ) {
//           double answer = resultv2 / result;
//            System.out.println ((double) Math.round(answer * 100) / 100);
//        }else{
//            double answer = result / resultv2;
//            System.out.println ((double) Math.round(answer * 100) / 100);
//        }
//_______________________________________________________________________________________

//        int first = 0;
//        int second = 25;
//
//        int nr1 = first + (int) (Math.random() * (second - first));
//        int nr2 = first + (int) (Math.random() * (second - first));
//        int nr3 = first + (int) (Math.random() * (second - first));
//
//        System.out.println("nr1: " + nr1);
//        System.out.println("nr2: " + nr2);
//        System.out.println("nr3: " + nr3);
//
//        if (nr1 < nr2 && nr2 < nr3) {
//            System.out.println(nr2);
//        } else if (nr1 < nr3 && nr3 < nr2) {
//            System.out.println(nr3);
//        } else if (nr2 < nr1 && nr1 < nr3) {
//            System.out.println(nr1);
//        } else if (nr3 < nr2 && nr2 < nr1){
//            System.out.println(nr2);
//        } else if (nr2 < nr3 && nr3 < nr1) {
//            System.out.println(nr3);
//        } else if (nr3 < nr1 && nr1 < nr2){
//            System.out.println(nr1);
//        } else {
//            System.out.println("Neveikia");
//        }

        //_____________________________________________________________________________________

//        int first = 1;
//        int second = 10;
//
//        int a = first + (int) (Math.random() * (second - first));
//        int b = first + (int) (Math.random() * (second - first));
//        int c = first + (int) (Math.random() * (second - first));
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//
//        if (a + b > c && a + c > a && b + c > a) {
//            System.out.println("Trikampis egzistuoja");
//        } else {
//            System.out.println("Trikampis neegzisuoja");
//        }

        //_____________________________________________________________________________________
//
//          int first = 0;
//          int second = 2;
//
//        int nr1 = first + (int) (Math.random() * (second - first));
//        int nr2 = first + (int) (Math.random() * (second - first));
//        int nr3 = first + (int) (Math.random() * (second - first));
//        int nr4 = first + (int) (Math.random() * (second - first));
//
//        System.out.println(nr1);
//        System.out.println(nr2);
//        System.out.println(nr3);             //NEPABAIGTA
//        System.out.println(nr4);
//
//        if (nr1 < 0 && nr2 < 0 && nr3 < 0 && nr4 < 0);

        //___________________________________________________________________________________________

//        int first = -10;
//        int second = 10;
//
//        int a = first + (int) (Math.random() * (second - first));
//        int b = first + (int) (Math.random() * (second - first));
//        int c = first + (int) (Math.random() * (second - first));
//
//
//
//        if ((a < 0 ) || (b < 0) || (c < 0)) {
//            System.out.println("[" + a + "]");
//            System.out.println("[" + b + "]");
//            System.out.println("[" + c + "]");
//        } else if (a > 0 || b > 0 || c > 0) {
//            System.out.println("{" + a + "}");
//            System.out.println("{" + b + "}");
//            System.out.println("{" + c + "}");
//        } else {
//            System.out.println("(" + a + ")" );
//            System.out.println("(" + b + ")" );
//            System.out.println("(" + c + ")" );
//        }
//
//        int candle = 1;
//        int first = 5;
//        int second = 3000;
//
//        int candlequantity = first + (int) (Math.random() * (second - first));
//        System.out.println(candlequantity);
//
//        if (candlequantity >= 1000) {
//            double answer = ( 1 - ( 1 * 0.03 )) * 1000;
//            System.out.println(candlequantity);
//        } else if (candlequantity >= 2000 ) {
//          double answer = ( 1 - (1 * 0.04 )) * 1000;
//            System.out.println(candlequantity);
//        } else {
//            System.out.println("neveikia");
//        }

        //_________________________________________________________________________________________________________

        int min_val = 0;
        int max_val = 100;

        int result1 = min_val + (int) Math.round(Math.random() * (max_val - min_val));
        int result2 = min_val + (int) Math.round(Math.random() * (max_val - min_val));
        int result3 = min_val + (int) Math.round(Math.random() * (max_val - min_val));

        int answer =  (result1 + result2 + result3) / 3;
        System.out.println("answer: " + answer );


        if (result1 > 10 || result1 < 90 && result2 > 10 || result2 < 90 && result3 > 10 || result3 < 90) {
            int answerv2 =  (result1 + result2 + result3) / 3;
            System.out.println("Aritmetinis vidurkis: " + answer);
        } else {
            System.out.println("not possible to calculate");


        }
    }
}

