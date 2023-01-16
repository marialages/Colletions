/*Dados as seguintes informações sobre meus gatos,crie uma lista
e ordene eta lista exibindo:
(nome-idade-cor);

Gato 1: nome: Jon, idade:18, cor: preto
Gato 2: nome: Simba, idade:6, cor: tigrado
Gato 3: nome: Jon, idade:12, cor: amarelo
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
           add(new Gato("Jon", 18, "preto"));
           add(new Gato("Simba", 6, "tigrado"));
           add(new Gato("Jon", 12, "amarelo"));
        }};
        System.out.println(meusGatos);

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Aleatória\t---");//nao existe um metodo especifico, ai usamos o metodo shuffle
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural(Nome)\t---");//como estou querendo comparar de acordo com a ordem natural,e uma list armazena de acordo com  o método de inserção,eu preciso utilizar o método(sorted) que faz essa comparação pra mim,pórem ele precisa que passemos um métado comparator, só que a ordem natural usamos comparable, por isso usamos o metodo colletions.sort que esse recebe uma list, que tem que ter um metodo comparable
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Idade\t--");//como ja usamos o comparable acima , não podemos utilizar de novo e ai no caso agora usamos o comparator
        //Collections.sort(meusGatos,new ComparatorIdade());//e ai vamos criar um comparator
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Cor\t---");//
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        meusGatos.sort(new ComparadorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }//construtor com alt+ insert --construtor--seleciona todos e ok

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }//getter com alt+ insert --construtor--seleciona todos e ok

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';//to string
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }//pra ordenar de acordo com a ordem natural eu preciso incrementar o metodo comparable , e esse metodo comparable me obriga a escrever o metodo compareto
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparadorNomeCorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome!= 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor !=0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

