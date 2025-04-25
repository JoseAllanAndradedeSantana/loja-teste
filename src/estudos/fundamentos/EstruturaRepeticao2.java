package estudos.fundamentos;

public class EstruturaRepeticao2 {
    public static void main(String[] args){
        //imprima os numeros pares de 0 ate 100000
        for(int i =0; i<=10;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        //imprimir 1 a 25
        for (int i =0; i <= 50; i++){
            if(i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
