package estudos.fundamentos;

public class TipoString {
    public static void main(String[] args){
        String nome = "Jose Allan";
        String profisao = "Programador";

        String mensagem = String.format("Nome: [%s] e profisao: [%s]", nome, profisao);

        System.out.println(mensagem);
    }
}
