package estudos.fundamentos;

public class EstruturaRepeticao1 {
    public static void main(String[] args){
        // while do while for
        int contador = 0;

        while(contador <= 10){
            System.out.println("contador: "+ contador);
            contador++;
        }

        do{
            System.out.println("contador: " +contador);
            contador++;
        }while (contador <= 20);

        for(int i =0; i <=10; i++){
            System.out.println("i: " +  i);
        }
    }
}
