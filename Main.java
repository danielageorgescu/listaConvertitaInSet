package com.itfactory;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("portocale");
        lista.add("avocado");
        lista.add("mere");
        lista.add("pere");
        lista.add("prune");
        lista.add("portocale");
        lista.add("kiwi");
        lista.add("prune");
        lista.add("zmeura");
        lista.add("mere");
        lista.add("cirese");
        lista.add("capsuni");
        lista.add("avocado");
        lista.add("prune");
        lista.add("capsuni");

        Set<String> fructeUnicate = new HashSet<>();
        fructeUnicate.addAll(lista);
        System.out.println(fructeUnicate);
    }
}
