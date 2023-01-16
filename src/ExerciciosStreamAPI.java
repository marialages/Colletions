import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        //como coloco o argumento dentro da operaçao
       /* numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {//vai pegar cada elemento do tipo string e vai imprimir
                System.out.println(s);
            }
        });*/
        numerosAleatorios.forEach(System.out::println);


        System.out.println("Pegue os 5 primeiros e coloque dentro de um Set: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);//Lemprar que um Set nao aceita numeros repetidos, ou seja ele pegou os 5 primeiros mas nao aparece os 5

        /*System.out.println("Transforme esta lista de String em uma lista de números inteiros: ");//vamos usar um Map
        List<Integer> collectList = numerosAleatorios.stream()
                /*.map(new Function<String, Integer>() {
                     @Override
                     public Integer apply(String s) {
                         return Integer.parseInt(s);
                     }
                 });*/
                /*.map(Integer::parseInt)
                .collect(Collectors.toList());*/


        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                /*.map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if (i % 2 == 0 && i > 2) return true;
                        return false;
                    }
                }).collect(Collectors.toList());
        System.out.println(listParesMaioresQue2 );*/
                .map(Integer::parseInt)
                .filter(i -> (i %2 ==0 && i > 2)).collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);

        System.out.println("Mostre a média dos númeors: ");
        numerosAleatorios.stream()
                /*.mapToInt(new ToIntFunction<String>() {
                    @Override
                    public int applyAsInt(String value) {
                        return Integer.parseInt(s);
                    }*/
                .mapToInt(Integer::parseInt)
                .average()//pra saber a media
                /*.ifPresent(new DoubleConsumer() {
                    @Override
                    public void accept(double v) {
                        System.out.println(v);
                    }*/
                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares: ");
        List<Integer>numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        /*numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer %2 !=0) return true;
                return false;
            }
        });
        System.out.println(numerosAleatoriosInteger);*/
        numerosAleatoriosInteger.removeIf(integer -> integer %2 !=0);
        System.out.println(numerosAleatoriosInteger);




    }
    }
