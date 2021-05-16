import java.util.LinkedList;
import java.util.Queue;


public class UtilizingQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Anderson Carvalho");
        filaBanco.add("Nikola Tesla");
        filaBanco.add("Paul Allen");
        filaBanco.add("Steve Jobs");
        filaBanco.add("Eric Ries");

        System.out.println(filaBanco);

        String verifPrimeiroItem = filaBanco.peek();

        System.out.println(verifPrimeiroItem);

        String verifPrimeiroItem2 = filaBanco.element();

        int tamanho = filaBanco.size();

        System.out.println(verifPrimeiroItem2);
        /*
         * Utilizando .peek e .element o primeiro item é retornado,
         * porém, ele continua na lista
         */
        System.out.println("A fila contém " + tamanho
                + " elementos");

        System.out.println(filaBanco);

        String retirandoDaFila = filaBanco.poll();
        tamanho = filaBanco.size();
        System.out.println(retirandoDaFila);
        /*
         * Utilizando o .poll o primeiro elemento é retornado,
         * porém, ele é retirado da lista
         */
        System.out.println("Agora a fila contém "
                + tamanho + " elementos:");

        for (String cliente : filaBanco) {
            System.out.println("* " + cliente);
        }
        System.out.println("Limpando a fila ...");
        boolean situacao = filaBanco.isEmpty();
        System.out.println("Fila vazia? " + situacao);
        filaBanco.clear();
        situacao = filaBanco.isEmpty();
        System.out.println("Fila vazia? " + situacao);

    }
}
