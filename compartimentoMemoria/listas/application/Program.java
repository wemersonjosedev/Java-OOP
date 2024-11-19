package compartimentoMemoria.listas.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("Monteiro");
        list.add("Ana");
        list.add("Victor");
        list.add("Eduardo");
        list.add("Eduarda");
        list.add(2, "Italo");

        System.out.println(list.size());

        for(String x : list){
            System.err.println(x);
        }

        System.out.println("---------------------------------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.err.println(x);
        }
        System.out.println("---------------------------------------------");
        System.out.println("Index of Eduardo: " + list.indexOf("Eduardo"));
        System.out.println("Index of Maeo: " + list.indexOf("Maeo"));

        System.out.println("---------------------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'E').collect(Collectors.toList());
        for (String x : result) {
            System.err.println(x);
        }


        System.out.println("---------------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'k').findFirst().orElse(null);
        System.out.println(name);
    }
}
