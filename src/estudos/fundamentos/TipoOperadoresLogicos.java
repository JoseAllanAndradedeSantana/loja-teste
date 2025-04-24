package estudos.fundamentos;

public class TipoOperadoresLogicos {

    public static void main(String[] args){
        // AND &&
        //OR ||
        int idade = 35;
        double salario = 3500.00;

        boolean isDentroDaLeiMaiorQueTrintaAnos = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrintaAnos = idade < 30 && salario >= 3381;

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double valorPlaystationCinco = 5000;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystationCinco || valorTotalContaPoupanca > valorPlaystationCinco;
        System.out.println(" Playstation 5 Compravel ? : " + isPlaystationCincoCompravel);

    }
}
