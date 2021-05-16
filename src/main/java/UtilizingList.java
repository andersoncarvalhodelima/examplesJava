import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Código utilizado para praticar alguns comandos em ArrayList

public class UtilizingList {
    /*
     *  Criado por Anderson Carvalho
     */
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Elon Musk");
        nomes.add("Warren Buffett");
        nomes.add("Stephen Hawking");
        nomes.add("Charlie Munger");
        nomes.add("Ben Horowitz");

        System.out.println(nomes);
        int tamanho = nomes.size();
        System.out.println("Neste momento a lista possui " + tamanho + " posições");
        nomes.set(2, "Bill Gates");
        System.out.println("Alterando Stephen Hawking por Bill Gates"
                + " teremos os seguintes nomes (em ordem alfabética): ");

        Collections.sort(nomes);

        for (String nomeDoItem : nomes) {
            System.out.println(nomeDoItem);
        }
        System.out.print("Bill Gates ainda está na lista? ");
        boolean buscandoBill = nomes.contains("Bill Gates");
        System.out.println(buscandoBill);

        System.out.println("Vamos remover o Bill para verificar se o código está correto");
        int posicaoBill = nomes.indexOf("Bill Gates");
        nomes.remove(posicaoBill);
        System.out.println(nomes);

        System.out.print("Bill Gates ainda está na lista? ");
        buscandoBill = nomes.contains("Bill Gates");
        System.out.println(buscandoBill);

        nomes.add(4, "Satoshi Nakamoto");

        System.out.println("Vamos verificar quem são os elementos depois de algumas alterações");

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println("* " + iterator.next());
        }

        System.out.println("Faltou colocar em ordem, né? Pera aí!");

        Collections.sort(nomes);

        iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println("* " + iterator.next());
        }

        System.out.println("E se a gente criar outra lista?");

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Jeff Bezos");
        nomes2.add("Jack Ma");
        nomes2.add("Steve Wozniak");

        System.out.println(nomes2);

        System.out.println("Que tal juntar as duas listas e colocar os nomes em ordem?");

        List<String> listaFinal = new ArrayList<>();
        listaFinal.addAll(nomes);
        listaFinal.addAll(nomes2);
        Collections.sort(listaFinal);

        System.out.println(listaFinal);

        System.out.println("Bom ... Vamos acabar com essa lista!");
        nomes.clear();
        boolean listavazia = nomes.isEmpty();
        tamanho = nomes.size();
        System.out.println("Lista vazia? " + listavazia);
        System.out.println("Total de " + tamanho + " elementos");

    }
}
