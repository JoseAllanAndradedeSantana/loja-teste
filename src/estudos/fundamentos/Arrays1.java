package estudos.fundamentos;

public class Arrays1 {
    public static void main(String[] args) {
        int[] idades = new int[5];
        idades[0] = 1;
        idades[1] = 2;
        idades[2] = 3;
        idades[3] = 4;
        idades[4] = 5;
        int length = idades.length;
        System.out.println(length);
        for (int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }
    }
}
