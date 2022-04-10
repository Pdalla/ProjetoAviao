package main.classes.comparadores;

import main.classes.Voo;

import java.util.Comparator;

public class ComparadorOrigem implements Comparator<Voo> {

    @Override
    public int compare(Voo voo1, Voo voo2) {
        if (voo1.getOrigem().compareTo(voo2.getOrigem()) > 0) {
            return 1;
        } else if ((voo1.getOrigem().compareTo(voo2.getOrigem()) == 0)) {
            return 0;
        }
        return -1;
    }

}

//s1 == s2
//    return 0;
//s2 > s1
//    return 1;
//s1 < s2
//    return -1;