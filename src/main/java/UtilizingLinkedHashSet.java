import java.util.LinkedHashSet;
import java.util.Set;


public class UtilizingLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(9);
        sequenciaNumerica.add(10);
        sequenciaNumerica.add(7);
        sequenciaNumerica.add(15);
        sequenciaNumerica.add(3);

        /*
         * A implementação LinkedHashSet mantém a ordem
         * de inserção.
         */
        System.out.println(sequenciaNumerica);
        sequenciaNumerica.add(17);
        System.out.println(sequenciaNumerica);
        sequenciaNumerica.remove(3);
        System.out.println(sequenciaNumerica);

        int tamanho = sequenciaNumerica.size();
        System.out.println("Numero de elementos: " + tamanho);

        for (Integer numero : sequenciaNumerica) {
            System.out.println(" * " + numero);
        }

        System.out.println("Zerando ...");
        sequenciaNumerica.clear();
        tamanho = sequenciaNumerica.size();
        System.out.println("Número de elementos: " + tamanho);
        boolean situacao = sequenciaNumerica.isEmpty();
        System.out.println(situacao);
    }
}
