import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        //Dada uma lista com 7 notas de um aluno [7,8.5,9,5,7,0,3.6]

        System.out.println("Crie uma lista e adicione as sete notas");

        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);

         System.out.println("Exiba a posicao da nota 5.0:" + notas.indexOf(5.0));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4 , 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 esta na lista " + notas.contains(5.0));

        System.out.println("Exiba todas as notas na ordem que foram informadas" );//como estamos utilizando um list obrigatoriamente os elementos quando adicionados eles sao armazenados de acordo com o método de inserção
        for (Double nota:notas) System.out.println(nota); {
        }//pra ficar diferente vamos imprimir uma embaixo da outra  usando o for each


        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota:" + Collections.min(notas));//não existe um método nativo pra chamar e retornar o menor valor, mas posso usar o metodo colletions.min pois nossa lista é uma colletion, e ele so sabe comprar pois se abrirmos o metodo double veremos que dentro tem o metodo comparable, logo asssim ele consegue identificar a menor nota

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //System.out.println("\"Exiba a soma dos valores: \"");
        notas.iterator();
        Iterator<Double> iterator = notas.iterator();// vou criar uma variavel pra facilitar  utilizamos o guto ctrol+ alt v
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(notas);

        System.out.println("Exiba a soma dos valores: " + soma);// não existe um método especifico pra isso mas posso utilizar metódo interator pra que eu possa interar, e a partir dessa interação pegar os elementos  e ir somando.

        System.out.println("Exiba a media das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista:");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    }
}
