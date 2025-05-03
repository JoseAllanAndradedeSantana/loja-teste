package estudos.padraodeprojeto;

public class Facede {
    private static final Facede INSTANCE = new Facede();

    private Facede(){
    }
    public static Facede getInstance(){
        return INSTANCE;
    }
    public static void migrarCliente(String nome,String cep){
        String estado = CepApi.getInstance().recuperarEstado(cep);
        String cidade = CepApi.getInstance().recuperarCidade(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
