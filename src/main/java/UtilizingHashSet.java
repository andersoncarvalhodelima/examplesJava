import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UtilizingHashSet {
    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(9.8);
        notasAlunos.add(9.2);
        notasAlunos.add(9.9);
        notasAlunos.add(8.9);
        notasAlunos.add(8.5);
        notasAlunos.add(8.7);
        notasAlunos.add(9.5);

        /*
         * HashSet é utilizado para melhor performance
         * Por isso, ele não respeita a ordem
         * dos elementos
         */
        System.out.println(notasAlunos);

        notasAlunos.remove(8.5);
        System.out.println(notasAlunos);

        notasAlunos.add(9.1);
        System.out.println(notasAlunos);

        boolean buscandoNota = notasAlunos.contains(8.7);
        System.out.println(buscandoNota);

        notasAlunos.remove(8.7);
        buscandoNota = notasAlunos.contains(8.7);
        System.out.println(buscandoNota);

        int tamanho = notasAlunos.size();
        System.out.println("Temos " + tamanho + " elementos.");

        Iterator<Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        notasAlunos.clear();

    }
}
