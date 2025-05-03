package estudos.padraodeprojeto;

public class CrmService {
    private CrmService(){

    }
    public static void gravarCliente(String nome,String cep,String cidade,String estado){
        System.out.println("########################################");
        System.out.println("Cliente salvo com sucesso no sistema CRM");
        System.out.println("Nome: "+nome);
        System.out.println("Cidade: "+cidade);
        System.out.println("Estado: "+estado);
        System.out.println("Cep: "+cep);

    }
}
