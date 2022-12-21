
package fikt.kni.oop.z02;

import java.util.HashMap;
import java.util.Map;

public class Recnik {
    Map<String, String> recnik =  new HashMap<String, String>();

    public void zborovi() {
        recnik.put("Word", "Zbor");
        recnik.put("Door", "Vrata");
        recnik.put("Glasses", "Naocari");
        recnik.put("Pencil", "Moliv");
        recnik.put("Book", "Kniga");
    }

    public void prebaruvanje (String zbor) {
        if(recnik.containsKey(zbor)) {
            System.out.println(recnik.get(zbor));
        }
        else {
            System.out.println("Toj zbor go nema vo recnikot.");
        }
    }
}