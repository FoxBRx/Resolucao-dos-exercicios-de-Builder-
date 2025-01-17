package Veiculo;

import Veiculo.builder.VeiculoBuilder;
import Veiculo.entidades.Veiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cor = "";
        String tipo = "";
        int qtdRodas = 0;

        System.out.print("Escolha o tipo de veiculo que deseja configurar: \n" +
                "1 - Carro \n" +
                "2 - Moto \n" + "Opção: ");
        tipo = sc.nextLine();

        switch (tipo) {
            case "1": qtdRodas = 4; tipo = "Carro";

                System.out.println("Veiculo do tipo carro selecionado, e possuirá 4 rodas");
                System.out.print("Qual a cor da pintura?" +
                        "\n1 - Azul" + "\n2 - Branco" + "\nOpção: ");
                cor = sc.nextLine();

                if (cor.equals("1")) {
                    cor = "Azul";
                } else if (cor.equals("2")) {
                    cor = "Branco";
                }

                break;

            case "2": qtdRodas = 2; tipo = "Moto";
                System.out.println("Veiculo do tipo moto selecionado, e possuirá 2 rodas");
                System.out.print("Qual a cor da pintura?" +
                        "\n1 - Azul" + "\n2 - Branco" + "\nOpção: ");
                cor = sc.nextLine();

                if (cor.equals("1")) {
                    cor = "Azul";
                } else if (cor.equals("2")) {
                    cor = "Branco";
                }

                break;

            default:
                System.out.println("Opcão inválida");

        }

        Veiculo veiculo = new VeiculoBuilder()
                .setTipo(tipo)
                .setCor(cor)
                .setQtdRodas(qtdRodas)
                .build();

        System.out.println(veiculo.toString());
    }
}
