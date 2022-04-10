package main.classes.comparadores;

import main.classes.Voo;

import java.util.Comparator;

public class ComparadorEmpresa implements Comparator<Voo> {

    @Override
    public int compare(Voo voo1, Voo voo2) {
        if (voo1.getEmpresa().compareTo(voo2.getEmpresa()) > 0) {
            return 1;
        } else if ((voo1.getEmpresa().compareTo(voo2.getEmpresa()) == 0)) {
            return 0;
        }
        return -1;
    }

}
