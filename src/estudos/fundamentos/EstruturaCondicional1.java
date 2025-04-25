package estudos.fundamentos;

public class EstruturaCondicional1 {
    public static void main(String[] args){
        int idade = 17;
        boolean isAutorizado = idade >= 18;

        if(isAutorizado){
            System.out.println("Maior de idade autorizado");
        }

        if(!isAutorizado){
            System.out.println("Menor de idade nao autorizado");
        }
        // ou
        if(isAutorizado == false){
            System.out.println("Menor de idade nao autorizado");
        }
    }
}
