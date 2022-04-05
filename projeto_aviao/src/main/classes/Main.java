package main.classes;

import main.classes.interfacee.InterfaceLeitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* LENDO ARQUIVO E GERANDO UMA UNICA LISTA LINHAS COM TODO CONTÉUDO*/
        InterfaceLeitor interfaceLeitor = new LeitorArquivo();
        List<String> linhas = interfaceLeitor.leLinhas("flights.csv");
        System.out.println(linhas);

    }
}
