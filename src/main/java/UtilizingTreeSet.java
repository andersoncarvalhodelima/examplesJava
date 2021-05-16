import java.util.Iterator;
import java.util.TreeSet;


public class UtilizingTreeSet {
    public static void main(String[] args) {
        TreeSet<String> estadosEmQuePossoTrabalhar = new TreeSet<>();
        estadosEmQuePossoTrabalhar.add("São Paulo");
        estadosEmQuePossoTrabalhar.add("Minas Gerais");
        estadosEmQuePossoTrabalhar.add("Rio de Janeiro");
        estadosEmQuePossoTrabalhar.add("Santa Catarina");
        estadosEmQuePossoTrabalhar.add("Paraná");
        estadosEmQuePossoTrabalhar.add("Goiás");
        estadosEmQuePossoTrabalhar.add("Mato Grosso do Sul");
        estadosEmQuePossoTrabalhar.add("Rio Grande do Sul");
        estadosEmQuePossoTrabalhar.add("Mato Grosso");

        /*
         * A implementação TreeSet possui um método de
         * ordenação automático
         */
        System.out.println(estadosEmQuePossoTrabalhar);

        //retorna o primeiro elemento do TreeSet
        //sem remove-lo da lista
        String primeiro = estadosEmQuePossoTrabalhar.first();
        System.out.println(primeiro);
        System.out.println(estadosEmQuePossoTrabalhar);

        //retorna o primeiro elemento do TreeSet
        //e o remove da lista
        primeiro = estadosEmQuePossoTrabalhar.pollFirst();
        System.out.println(primeiro);
        System.out.println(estadosEmQuePossoTrabalhar);

        //retorna o ultimoo elemento do TreeSet
        //sem remove-lo da lista
        String ultimo = estadosEmQuePossoTrabalhar.last();
        System.out.println(ultimo);
        System.out.println(estadosEmQuePossoTrabalhar);

        //retorna o ultimo elemento do TreeSet
        //e o remove da lista
        ultimo = estadosEmQuePossoTrabalhar.pollLast();
        System.out.println(ultimo);
        System.out.println(estadosEmQuePossoTrabalhar);

        //retorna o valor abaixo do informado
        //seguindo a ordem da TreeSet
        String abaixo = estadosEmQuePossoTrabalhar.lower("Minas Gerais");
        //retorna o valor acima do informado
        //seguindo a ordem da TreeSet
        String acima = estadosEmQuePossoTrabalhar.higher("Rio de Janeiro");

        System.out.println(abaixo);
        System.out.println(acima);

        int tamanho = estadosEmQuePossoTrabalhar.size();
        System.out.println("No momento o TreeSet possui " + tamanho + " elementos.");

        Iterator<String> iterator = estadosEmQuePossoTrabalhar.iterator();

        while (iterator.hasNext()) {
            System.out.println("* " + iterator.next());
        }

        System.out.println("Corrigindo ...");
        estadosEmQuePossoTrabalhar.clear();

        estadosEmQuePossoTrabalhar.add("Remotamente podemos trabalhar de qualquer lugar!");
        System.out.println(estadosEmQuePossoTrabalhar);
    }
}
