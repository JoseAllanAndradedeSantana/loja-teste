package estudos.fundamentos;

public class TipoOperadores {
    public static void main(String[] args){
        //Operadores Aritmeticos
        // + - * /
        int numero1 = 10;
        int numero2 = 20;

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        // o resultado de dois numeros inteiros sempre retorna um numero inteiro por isso 0.0
        double divisao = numero1 / numero2;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
    }
}
