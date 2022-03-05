package com.mycompany.buscaconsorcio;

import java.util.Scanner;

/**
 *
 * @author deusf
 */
public class Utilitarios {

    void menu() {
        Scanner leitorSelecaoMenu = new Scanner(System.in);

        System.out.println("\nSelecione uma opção no menu.");
        System.out.println("Opção 1 - Calcular média recomendada "
                + "para consorcio");

        System.out.println("Opção 2 - Tipo de consorciado.");
        System.out.println("Opção 3 - Simulação de contemplação");
        System.out.println("Opção 4 - Encerrar programa");

        Integer opcaoMenu = leitorSelecaoMenu.nextInt();
        Utilitarios utilClass = new Utilitarios();

        while (opcaoMenu < 0 || opcaoMenu > 4) {
            System.out.println("Insira uma opção válida");
            opcaoMenu = leitorSelecaoMenu.nextInt();
        }

        switch (opcaoMenu) {
            case 1:
                System.out.println("Com o Busca Consorciado, ajudamos você a iniciar "
                        + "nesse setor de consorcio. \n");
                utilClass.rendaMensal();

                break;
            case 2:
                System.out.println("Simulador de Consórcio");
                utilClass.simuladorDeConsorcio();
                break;
            case 3:

                System.out.println("Opção 3");
                utilClass.simuladorDeContemplacao();

                break;
            case 4:
                System.out.println("Obrigado por nos visitar!");
                break;
        }
    }

    void rendaMensal() {
        Scanner leitorValores = new Scanner(System.in);
        Scanner leitorNome = new Scanner(System.in);

        System.out.println("- Simulador de renda -");

        System.out.println("");
        System.out.println("Insira seu nome.");
        String nomeDigitado = leitorNome.nextLine();

        System.out.println(String.format("Olá %s, insira sua renda mensal.", nomeDigitado));
        Double salarioDigitado = leitorValores.nextDouble();

        while (salarioDigitado < 1200) {
            System.out.println("Recomedamos que possua uma renda maior que R$ 1200,00."
            );

            System.out.println(String.format("Qual sua renda mensal, %s?", nomeDigitado));
            salarioDigitado = leitorValores.nextDouble();
        }

        Double valorRecomendadoParaComecar = salarioDigitado * 0.3;

        System.out.println(String.format(
                "Recomendamos que invista R$ %.2f que é 30%% de sua renda "
                + "para cobrir com segurança\n imprevistos e garantir "
                + "que possa prosseguir com seu sonhado bem a ser"
                + " adquirido", valorRecomendadoParaComecar));

        System.out.println("\nDeseja simular novamente?");
        System.out.println(""
                + "Sim - 1 Simular novamente\n"
                + "Não - 2 Voltar ao menu principal");
        voltarAoMenuPrincipalOpcao01();

    }

    void voltarAoMenuPrincipalOpcao01() {
        Scanner leitorSelecaoMenu = new Scanner(System.in);
        Integer opcaoMenu = leitorSelecaoMenu.nextInt();

        while (opcaoMenu < 1 || opcaoMenu > 2) {
            System.out.println("Opção invalida \n"
                    + "1 - Recomeçar simulação \n"
                    + "2- Voltar ao menu");
        }

        switch (opcaoMenu) {
            case 1:
                rendaMensal();
                break;
            case 2:
                menu();
                break;
        }
    }

    void voltarAoMenuPrincipalOpcao02() {
        Scanner leitorSelecaoMenu = new Scanner(System.in);
        Integer opcaoMenu = leitorSelecaoMenu.nextInt();

        while (opcaoMenu < 1 || opcaoMenu > 2) {
            System.out.println("Opção invalida \n"
                    + "1 - Recomeçar simulação \n"
                    + "2- Voltar ao menu");
        }

        switch (opcaoMenu) {
            case 1:
                simuladorDeConsorcio();
                break;
            case 2:
                menu();
                break;

        }
    }

    void voltarAoMenuPrincipalOpcao03() {
        Scanner leitorSelecaoMenu = new Scanner(System.in);
        Integer opcaoMenu = leitorSelecaoMenu.nextInt();

        while (opcaoMenu < 1 || opcaoMenu > 2) {
            System.out.println("Opção invalida \n"
                    + "1 - Recomeçar simulação \n"
                    + "2- Voltar ao menu");
        }

        switch (opcaoMenu) {
            case 1:
                simuladorDeContemplacao();
                break;
            case 2:
                menu();
                break;
        }
    }

    void simuladorDeConsorcio() {
        Scanner leitorValores = new Scanner(System.in);

        System.out.println("\n- Simulador Consorcio -");

        System.out.println("\nEscolha Opção de concorcio");
        System.out.println("\n1 - Bradesco Consórcios \n"
                + "Taxa de aministração: 23% \n"
                + "Fundo reserva:         3% \n"
                + "Seguro de grupo:       2,5% \n\n"
        );
        System.out.println("2 - Magalu Consórcios \n"
                + "Taxa de aministração: 18% \n"
                + "Fundo reserva:         4% \n"
                + "Seguro de grupo:       3% \n\n"
        );
        System.out.println("3 - Honda Concórcios \n"
                + "Taxa de aministração: 20% \n"
                + "Fundo reserva:         4% \n"
                + "Seguro de grupo:       4% \n\n"
        );
        Integer opcaoMenu = leitorValores.nextInt();
        while (opcaoMenu < 1 || opcaoMenu > 3) {
            System.out.println("Opção inválida");
            System.out.println("1- Bradesco Consórcio\n"
                    + "2- Magalu Consórcio \n"
                    + "3- Honda Consórcios");
            opcaoMenu = leitorValores.nextInt();

        }
        switch (opcaoMenu) {
            case 1:
                System.out.println("Escolheu bradesco");

                System.out.println("\n Insira valor do bem a ser adquirido");
                Double valorDoBem = leitorValores.nextDouble();

                while (valorDoBem < 36000) {
                    System.out.println("\n Valor minimo é de R$ 36.000,00");
                    valorDoBem = leitorValores.nextDouble();
                }

                System.out.println("\n Escolha o prazo");
                Integer prazo = leitorValores.nextInt();

                while (prazo < 36) {
                    System.out.println(" \n Prazo Minimo é de 36 meses");
                    prazo = leitorValores.nextInt();
                }

                Double taxaAdministracao = 23.0;
                Double fundoReserva = 3.0;
                Double seguroGrupo = 2.5;

                if (prazo >= 24 && prazo <= 36) {
                    System.out.println("\n Consórcio de Médio Prazo");

                } else {
                    System.out.println("\n Consorcio de Longo Prazo");
                }

                System.out.println("\nSua cotação para o consorcio Bradesco Consórcios");

                calculadora(valorDoBem, prazo, taxaAdministracao, fundoReserva, seguroGrupo);
                ;
                break;
            case 2:
                System.out.println("Escolheu magalu");

                System.out.println("\n Insira valor do bem a ser adquirido");
                Double valorDoBem02 = leitorValores.nextDouble();

                while (valorDoBem02 < 50000) {
                    System.out.println("\n Valor minimo é de R$ 50.000,00");
                    valorDoBem02 = leitorValores.nextDouble();
                }

                System.out.println("\n Escolha o prazo");
                Integer prazo02 = leitorValores.nextInt();

                while (prazo02 < 24) {
                    System.out.println(" \n Prazo Minimo é de 24 meses");
                    prazo02 = leitorValores.nextInt();
                }

                Double taxaAdministracao02 = 18.0;
                Double fundoReserva02 = 4.0;
                Double seguroGrupo02 = 3.0;

                if (prazo02 >= 24 && prazo02 <= 36) {
                    System.out.println("Consórcio de Médio Prazo");

                } else {
                    System.out.println("Consorcio de Longo Prazo");
                }

                System.out.println("\nSua cotação para o consorcio Magalu Consórcios");

                calculadora(valorDoBem02, prazo02, taxaAdministracao02, fundoReserva02, seguroGrupo02);
                break;
            case 3:
                System.out.println("Escolheu honda");
                System.out.println("\n Insira valor do bem a ser adquirido");
                Double valorDoBem03 = leitorValores.nextDouble();

                while (valorDoBem03 < 42000) {
                    System.out.println("\n Valor minimo é de R$ 42.000,00");
                    valorDoBem03 = leitorValores.nextDouble();
                }

                System.out.println("\n Escolha o prazo");
                Integer prazo03 = leitorValores.nextInt();

                while (prazo03 < 48) {
                    System.out.println("\n Prazo Minimo é de 48 meses");
                    prazo03 = leitorValores.nextInt();
                }

                Double taxaAdministracao03 = 20.0;
                Double fundoReserva03 = 4.0;
                Double seguroGrupo03 = 4.0;

                if (prazo03 >= 24 && prazo03 <= 36) {
                    System.out.println("Consórcio de Médio Prazo");

                } else {
                    System.out.println("Consorcio de Longo Prazo");
                }

                System.out.println("\nSua cotação para o consorcio Honda Consórcios");

                calculadora(valorDoBem03, prazo03, taxaAdministracao03, fundoReserva03, seguroGrupo03);

                break;
        }

        System.out.println("\nDeseja simular novamente?");
        System.out.println(""
                + "Sim - 1 Simular novamente\n"
                + "Não - 2 Voltar ao menu principal");

        voltarAoMenuPrincipalOpcao02();
    }

    void calculadora(Double valorDoBem, Integer prazo, Double taxaDeAdministracao,
            Double fundoDeReserva, Double seguroDeGrupo) {

        Double valorDaParcela = valorDoBem / prazo;

        Double valorDaTaxa = (valorDoBem * (taxaDeAdministracao / 100)) / prazo;

        Double valorDeFundoReserva = (valorDoBem * (fundoDeReserva / 100)) / prazo;

        Double valorDoSeguro = (valorDoBem * (seguroDeGrupo / 100)) / prazo;

        Double valorTotal = valorDaTaxa + valorDeFundoReserva + valorDoSeguro
                + valorDaParcela;

        System.out.println(String.format(
                "\nValor do bem: R$ %.2f \n"
                + "Parcela: R$ %.2f \n"
                + "Meses:  %d \n"
                + "Taxa:  %.2f%% ou R$ %.2f \n"
                + "Fundo:  %.2f%% ou R$ %.2f \n"
                + "Seguro:  %.2f%% ou R$ %.2f \n"
                + "Valor total: R$ %.2f",
                valorDoBem, valorDaParcela, prazo,
                taxaDeAdministracao, valorDaTaxa,
                fundoDeReserva, valorDeFundoReserva,
                seguroDeGrupo, valorDoSeguro,
                valorTotal));

    }

    void simuladorDeContemplacao() {
        Scanner leitorValores = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        System.out.println("\n- Simulação de contemplação -");

        System.out.println(""
                + "\nNa contemplação é o momento ápice para o consorciado, \n"
                + "pois você pode receber a carta para adquirir ou guardar \n"
                + "a para que ela fique rendendo ao mês.");
        System.out.println("\n\nO rendimento mensal de 0,4% ao mês  até valores de "
                + "1% ao mês");

        System.out.println("\n\nDigite seu nome:");
        String nomeConsorciado = leitorTexto.nextLine();

        System.out.println("Digite o valor do bem");
        Double valorDoBem = leitorValores.nextDouble();

        System.out.println("\nDefina um prazo para a simulação");
        Integer prazoParaSimulacao = leitorValores.nextInt();

        while (prazoParaSimulacao < 12) {
            System.out.println("Prazo mínimo para simulação é de 12 meses");
            prazoParaSimulacao = leitorValores.nextInt();
        }
        calculadoraContemplacao(nomeConsorciado, valorDoBem, prazoParaSimulacao);

        System.out.println("\nDeseja simular novamente?");
        System.out.println(""
                + "Sim - 1 Simular novamente\n"
                + "Não - 2 Voltar ao menu principal");

        voltarAoMenuPrincipalOpcao03();

    }

    void calculadoraContemplacao(String nome, Double valor, Integer prazo) {
        Scanner leitorTexto = new Scanner(System.in);

        Integer numeroRandomico = (int) (Math.random() * prazo) + 1;
        for (int i = 1; i <= numeroRandomico; i++) {
            if (i != numeroRandomico) {
                System.out.println(String.format(
                        "\nNão contemplado na %d° assembleia.", i));
            } else {
                System.out.println("*".repeat(75));
                System.out.println(String.format("Você foi contemplado na %d "
                        + "assembleia", i));
                System.out.println("*".repeat(75));
            }
        }

        System.out.println("Você deseja resgatar a carta de contemplação?");
        System.out.println(""
                + "Sim - 1 \n"
                + "Não - 2");

        Integer opcaoContemplacao = leitorTexto.nextInt();
        while (opcaoContemplacao < 1 || opcaoContemplacao > 2) {
            System.out.println("Opção inválida");
        }

        switch (opcaoContemplacao) {
            case 1:
                System.out.println("*** PARABÉNS ***");
                System.out.println("Parece receber sua carta de contemplação, dirija-se"
                        + " consorciador com seus documentos");
                break;

            case 2:
                System.out.println(
                        String.format(""
                                + "%s, esse será o rendimento da sua cota"
                                + " não resgatada nos meses restante do grupo"
                                + " de consórcio.\n", nome));
                Integer mesesRestantes = prazo - numeroRandomico;
                Double rendimentContemplacao = valor;

                for (int i = 1; i <= mesesRestantes; i++) {
                    rendimentContemplacao += rendimentContemplacao * 0.004;
                    System.out.println(
                            String.format(
                                    "Rendimento R$%.2f - no %d mês guardado",
                                    rendimentContemplacao, i));
                }
                System.out.println(
                        String.format(""
                                + "\nSeu valor guardado é de R$ %.2f para resgatar"
                                + " no fechamento do grupo",
                                rendimentContemplacao));
                break;

        }
    }

}
