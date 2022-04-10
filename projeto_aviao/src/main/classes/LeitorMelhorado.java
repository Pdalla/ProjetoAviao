package main.classes;

import main.classes.comparadores.ComparadorDestino;
import main.classes.comparadores.ComparadorEmpresa;
import main.classes.comparadores.ComparadorOrigem;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeitorMelhorado {
    public static void main(String[] args) {

        String path = "C:\\Users\\Pedro Dalla\\Documents\\Lets_Code_Projetos\\projeto_aviao\\flights.csv";

        List<Voo> listavoos = new ArrayList<Voo>();

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
                Voo dadosvoo = new Voo(origem,destino,empresa,saida,chegada,price);
                listavoos.add(dadosvoo);
                line = br.readLine();
                
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }



        //CRIANDO GRUPOS DE ACORDO COM O ORIGEM
        Map<String, List<Voo>> voosgrupos =
                listavoos.stream().collect(Collectors.groupingBy(Voo::getOrigem));
        System.out.println("VOOS USANDO MAP");
        System.out.println(voosgrupos);

        //ORDENANDO LISTA POR ORIGEM
        System.out.println("LISTA ORDENADA POR !!ORIGEM!! ");
        Collections.sort(listavoos, new ComparadorOrigem());
        //ORDENANDO LISTA POR DESTINO
        Collections.sort(listavoos, new ComparadorDestino());
//        //ORDENANDO EMPRESA
//        Collections.sort(listavoos, new ComparadorEmpresa());
        for (Voo p : listavoos) {
            System.out.println(p);
        }

    }
}

