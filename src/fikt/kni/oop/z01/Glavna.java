package fikt.kni.oop.z01;

import java.util.HashMap;
import java.util.Map;

public class Glavna {

    public static void main(String[] args) {
        Map<String, String> recnik = new HashMap<String, String>();
        recnik.put("Dog", "Kuce");
        recnik.put("Owl", "Buv");
        recnik.put("Brave", "Hrabar");
        recnik.put("Animal", "Zivotno");
        recnik.put("Ring", "Prsten");

        System.out.println("Klucevi na mapata se: " + recnik.keySet());

        System.out.println("Vrednosti na mapata se: " + recnik.values());

        System.out.println("Klucevite i vrednostite: ");
        for(Map.Entry<String, String> entry : recnik.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        if(recnik.containsKey("Hi")) {
            System.out.println(recnik.values());
        }
        else {
            System.out.println("Nema takov zbor");
        }

    }

}