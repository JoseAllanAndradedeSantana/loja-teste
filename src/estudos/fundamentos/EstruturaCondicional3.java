package estudos.fundamentos;

public class EstruturaCondicional3 {
    public static void main(String[] args){
        double salario = 5000;
        String mensagemDoar = "Eu vou doar";
        String mensagemNaoDoar = "Eu não vou doar";

        //operador ternario
        String mensagemFinal = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(mensagemFinal);
    }
}
