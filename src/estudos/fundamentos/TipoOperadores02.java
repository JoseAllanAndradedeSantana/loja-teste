package estudos.fundamentos;

public class TipoOperadores02 {
    public static void main(String[] args){
        // resto %

        boolean isNumeroPar = 20 % 2 == 0;
        boolean isNumeroImpar = 21 % 2 > 0;
        int numeroPar = 20 % 2;
        int numeroImpar = 21 % 2;

        System.out.println(isNumeroImpar);
        System.out.println(isNumeroPar);
        System.out.println(numeroPar);
        System.out.println(numeroImpar);

        // menor <  menor igual <=
        // maior >  maior igual >=
        // igual ==
        // diferente !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorOuIgualDez = 10 >= 10;
        boolean isDezMenorOuIgualDez = 10 <= 10;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDeVinte = 10 != 20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezMaiorOuIgualDez);
        System.out.println(isDezMenorOuIgualDez);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDeVinte);



    }
}
