package estudos.fundamentos;

public class EstruturaRepeticao3 {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condicao valor da parcela >= 1000

        double valorCarro = 40000;
        for (int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;

            if(valorParcela >= 1000){
                System.out.println(valorParcela);
            }else{
                break;
            }
        }
    }
}
