public class Exercicio1{
    public static void main(String[] args) {
        int numeroInicial = 100;
        int numeroFINAL = 200;
        System.out.println();
        while (numeroInicial <= numeroFINAL) {
            System.out.print(numeroInicial);
            if (numeroInicial < numeroFINAL) {
                System.out.print(" ");
            }
            numeroInicial++;
        }
        System.out.println();
    }
}
