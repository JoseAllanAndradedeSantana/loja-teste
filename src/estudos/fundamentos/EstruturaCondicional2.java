package estudos.fundamentos;

public class EstruturaCondicional2 {
    public static void main(String[] args){
        int nota = 7;
        boolean aprovado = nota >= 7;
        if(aprovado){
            System.out.println("Aprovado");
        }else{
            System.out.println("Exame");
        }

        // idade < 15 categoria infantil
        // idade >= 15 e idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 18;
        final String CATEGORIA_INFANTIL = "Categoria Infantil";
        final String CATEGORIA_JUVENIL = "Categoria Juvenil";
        final String CATEGORIA_ADULTO = "Categoria Adulto";

        boolean isCategoriaInfantil = idade < 15;
        boolean isCategoriaJuvenil = idade >= 15 || idade < 18;
        boolean isCategoriaAdulto = idade > 18;


        if(isCategoriaAdulto){
            System.out.println(CATEGORIA_ADULTO);
        }else if(isCategoriaJuvenil){
            System.out.println(CATEGORIA_JUVENIL);
        }else {
            System.out.println(CATEGORIA_INFANTIL);
        }


    }
}
