package estudos.fundamentos;

public class EstruturaCondicional5 {
    public static void main(String[] args) {
        //utilizando switch e dados os valores de 1 a 7, imprima se o dia é util ou final de semana
        // considerando 1 como domingo

        int diaSemana = 1;
        switch (diaSemana) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("Opcao Invalida");
        }
    }
}
