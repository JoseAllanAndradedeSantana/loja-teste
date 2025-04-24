package estudos.fundamentos;

/*
Prática

Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem
Eu <nome>, morando no endereço <endereço>
confirmo que recebi o salario de <salario> na data <data>
 */

public class TiposPrimitivos02Exercecio {

    public static void main(String[] args){
        String nome = "Allan";
        Double salario = 4000.00;
        String endereco = "Rua Jose Dias de Moraes";
        String data = "24/04/2025";
        String mensagem = String.format("Eu %s, morando no endereco %s confirmo que recebi o salario %.2f na data %s",nome,endereco,salario,data);
        System.out.println(mensagem);
    }
}
