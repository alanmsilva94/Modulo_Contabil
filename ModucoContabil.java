package modulocontabil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModuloContabil {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String continuar = "S";

        List<Pagamentos> pagamentosList = new ArrayList<>();

        System.out.print("----------------------------------Sistema de cálculo de imposto----------------------------------\n");

        while (continuar.equals("S")) {

            System.out.print("Para calcular Programa de Integração Social - digite [PIS] \n");
            System.out.print("Para calcular Imposto sobre Produtos Industrializados - digite [IPI] \n");
            System.out.print("Para mostrar os detalhes dos impostos cadastrados - digite [D] \n");
            System.out.print("Informe a operação desejada: ");
            String tipo = input.next().toUpperCase();
            System.out.print("\n");

            switch (tipo) {
                case "PIS":
                    System.out.print("Informe o nome da empresa: ");
                    String nome_empresa = input.next();
                    System.out.print("Digite o valor do débito: ");
                    double debito = input.nextDouble();
                    System.out.print("Digite o valor do crédito: ");
                    double credito = input.nextDouble();
                    
                    Pagamentos pagamentos = new Pagamentos(nome_empresa);
                    pagamentos.addImposto(new Pis(debito, credito));
                    pagamentosList.add(pagamentos);

                    break;

                case "IPI":

                    System.out.print("Informe o nome da empresa: ");
                    nome_empresa = input.next();
                    System.out.print("Digite o valor do produto: ");
                    double valorProduto = input.nextDouble();
                    System.out.print("Digite o valor do frete: ");
                    double frete = input.nextDouble();
                    System.out.print("Digite o valor do seguro: ");
                    double seguro = input.nextDouble();
                    System.out.print("Digite o valor de outras despesas: ");
                    double outrasDespesas = input.nextDouble();
                    System.out.print("Digite a alíquota (em %): ");
                    double aliquota = input.nextDouble();

                    pagamentos = new Pagamentos(nome_empresa);
                    pagamentos.addImposto(new Ipi(valorProduto, frete, seguro, outrasDespesas, aliquota));
                    pagamentosList.add(pagamentos);

                    break;

                case "D":
                    if (!pagamentosList.isEmpty()) {
                        for (Pagamentos pag : pagamentosList) {
                            pag.mostrarDetalhes();
                            System.out.print("\n");
                        }
                    } else {
                        System.out.println("Nenhum pagamento foi registrado ainda.");
                        System.out.print("\n");
                    }
                    break;
            }
            System.out.print("Deseja realizar outra operação? [S] para continuar ou [N] para encerrar: ");
            continuar = input.next().toUpperCase();
            System.out.print("\n");
        }
    }
}
