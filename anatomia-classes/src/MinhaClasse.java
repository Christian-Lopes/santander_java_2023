public class MinhaClasse {

    public static void main(String[] args) {
        System.out.println("Olá turma, seja bem vindos.");

        // Aula 02

        int ano = 2021;
        ano = 2022;

        final String BR = "Brasil";

        final double PI = 3.14;

        // Aula 03

        int idade = 23;
        double altura = 1.67;
        String nome = "Christian";
        boolean status = true;

        String primeiroNome = "Christian";
        String segundoNome = "Lopes de Olivira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

        // Aula 04

        int mediaFinal = 7;
        if (mediaFinal < 6) {
            System.out.println("Reprovado!");
        } else if (mediaFinal == 6) {
            System.out.println("Prova minerva!");
        } else {
            System.out.println("Aprovado!");
        }

        // Aula 06 Java Beans

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}