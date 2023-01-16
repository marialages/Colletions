import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        /*
        Dada os modelos dos carros e seus respectivos consumos na estrada,faça:
        modelo = gol - consumo = 14.4km/l
        modelo = uno - consumo = 15.6km/l
        modelo = mobi - consumo = 16.6km/l
        modelo = hb20 - consumo = 14.5km/l
        modelo = kwid - consumo = 15.6km/l
         */

        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);//no map não existe o metodo add por isso usamos o metodo put
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substita o consumo do gol por 15.2 km/l: ");
        carrosPopulares.put("gol", 15.2);//nao posso ter chaves repetidas vou usar o metodo pu
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionario:" + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno:" + carrosPopulares.get("uno"));

        System.out.println("Exiba o terceiro modelo adicionado: ");//não exite um método que eu possa fazer

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();//usamos esse metodo pra trabalhar com uma chave e valor separadamente
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
            System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            ;
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "-";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + "-" + consumoMenosEficiente);
            }
        }

        //System.out.println("Exiba a soma dos consumos");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo  igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);//o modelo é a chave e quem ordena a chave é o tremap
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o conjunto de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se a lista está vazia: " + carrosPopulares.isEmpty());

    }
}
