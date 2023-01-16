import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
         //Dda uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5,7, 0, 3.6], faça:

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        //System.out.println("Exiba a posição da nota 5.0");//em set não consigo fazer busca de acordo com a posição, logo não tem como fazer

        //System.out.println("Adicione na lista a nota 8.0 na posição 4:");//em set não consigo fazer busca de acordo com a posição, logo não tem como fazer

        //System.out.println("Substitua a nota 5.0 pela nota 6.0");//em set não tem como fazer isso

        System.out.println("Confira se a nota 5.0 esta no conjunto:"+ notas.contains(5d) );

        //System.out.println("Exiba a terceira nota adicionada:" );//em set não consigo fazer busca de acordo com a posição, logo não tem como fazer

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //System.out.println("Exiba a soma dos valores: " );
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma );

        System.out.println("Exiba a medias das notas: " + (soma/ notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);

        //System.out.println("Remova a nota da posição 0");//em set não consigo fazer busca de acordo com a posição, logo não tem como fazer

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");//como estou trabalhando com set , pra informar a ordem que foi informada eu nao posso trabalhar com hashset , tem que trabalhar com linkedhashset
        Set<Double> notas2 =  new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente");// eu tenho que utilizar TreeSet porque ela organiza de acordo com a ordem natural, e temos que trabalhar com o double pois ele tem o comparable
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo conjunto");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());



    }
}
