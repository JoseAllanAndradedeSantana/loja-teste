package estudos.padraodeprojeto;

public class CepApi {
    private final static CepApi INSTANCE = new CepApi();

    private CepApi(){
    }

    public static CepApi getInstance(){
        return INSTANCE;
    }

    public String recuperarEstado(String cep){
        return "SP";
    }
    public String recuperarCidade(String cep){
        return "Santos";
    }
}
