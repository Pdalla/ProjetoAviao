package main.classes;

import main.classes.interfacee.InterfaceLeitor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LeitorArquivo implements InterfaceLeitor {

    @Override
    public List<String> leLinhas(String caminhoArquivo) {
        // Lendo Arquivo

        List<String> listvoos = new ArrayList<>();
        try (
                FileReader entrada = new FileReader(caminhoArquivo);
                BufferedReader entradaComBuffer = new BufferedReader(entrada)
        ) {
            String linha = entradaComBuffer.readLine();
//            List<String> linhas = new ArrayList<>();
            linha = entradaComBuffer.readLine();
           while (linha != null) {
//                String[] vect = linha.split(";");
//                String origem = vect[0];
//                String destino = vect[1];
//                String empresa = vect[2];
//                String saida = vect[3];
//                String chegada = vect[4];
//                Double preco = Double.valueOf(vect[4]);


                listvoos.add(linha);
                linha = entradaComBuffer.readLine();
            }

            return listvoos;

        } catch  (FileNotFoundException excecao) {
            System.out.println("Arquivo nao existe");
            return null;
        } catch (IOException excecao) {
            System.out.println("IOException");
            return null;
        }
    }


}
