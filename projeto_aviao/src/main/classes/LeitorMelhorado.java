package main.classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorMelhorado {
    public static void main(String[] args) {

        String path = "C:\\Users\\Pedro Dalla\\Documents\\Lets_Code_Projetos\\projeto_aviao\\flights.csv";

        List<Voo> list = new ArrayList<Voo>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            line = br.readLine();
            while (line != null) {

                String[] vect = line.split(";");
                String origem = vect[0];
                String destino = vect[1];
                String empresa = vect[2];
                String saida = vect[3];
                String chegada = vect[4];
                Double price = Double.parseDouble(vect[5]);
                Voo prod = new Voo(origem,destino,empresa,saida,chegada,price);
                list.add(prod);

                line = br.readLine();
            }

            System.out.println("Lista de Voos:");
            for (Voo p : list) {
                System.out.println(p);
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

