package estudos.fundamentos;

public class Arrays3 {
    public static void main(String[] args){
        String[] nomes = new String[3];
        nomes[0] = "Jose Allan";
        nomes[1] = "Andrade de Santana";
        nomes[2] = "Isaac Santana";

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}
