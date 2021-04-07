package me.danielbispo.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Kleber");
        list.add(2, "Marco");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------------------");

        //remoção por predicado e função lambda
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Bob: " + list.indexOf("Marco"));
        System.out.println("------------------------------");

        //forma para filtrar apenas os que começam com A no nome
        //é preciso declarar uma nova lista, pegar a lista já existente (list),
        //converter ela pra uma stream() (operação do java 8 que aceita expressões lambda),
        //e a patir dele chamar o filter(). Esse filter recebe um predicado parecido com o anterior, mas com a letra A
        //Ou seja: o list vai me devolver um stream filtrado de acordo com o predicado
        // o stream nao é compativel com o list. Entao vai ter que pegar o stream e converter ele pra lista.
        //Para isso, vamos chamar a função collect e dentro dele um (Collectors.toList())
        //essa é a forma que o java 8 encontrou para fazer operações lambda com o List
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("------------------------------");
        //como pegar apenas o primeiro elemento que atenda um parametro, no caso o priemeiro que comeca com A no nome:
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(name);
    }
}
