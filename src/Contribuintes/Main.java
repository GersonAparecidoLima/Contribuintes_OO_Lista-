package Contribuintes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Contribuintes.TaxPayer;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<TaxPayer> taxpayers = new ArrayList<>();

        System.out.print("Quantos contribuintes você vai digitar? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        for (int i = 0; i < n; i++) {
        	
        	System.out.println(); // Linha em branco para separação
            System.out.println("Digite os dados do " + (i + 1) + "° contribuinte:");
            System.out.print("Renda anual com salário: ");
            double salaryIncome = scanner.nextDouble();
            System.out.print("Renda anual com prestação de serviço: ");
            double servicesIncome = scanner.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            double capitalIncome = scanner.nextDouble();
            System.out.print("Gastos médicos: ");
            double healthSpending = scanner.nextDouble();
            System.out.print("Gastos educacionais: ");
            double educationSpending = scanner.nextDouble();
            scanner.nextLine(); // Consumir a nova linha

            taxpayers.add(new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending));
          
        }

        System.out.println(); // Linha em branco para separação
        for (int i = 0; i < taxpayers.size(); i++) {
            TaxPayer taxpayer = taxpayers.get(i);
            System.out.printf("Resumo do %d° contribuinte:%n", (i + 1));
            System.out.printf("Imposto bruto total: %.2f%n", taxpayer.grossTax());
            System.out.printf("Abatimento: %.2f%n", taxpayer.taxRebate());
            System.out.printf("Imposto devido: %.2f%n", taxpayer.netTax());
            System.out.println(); // Linha em branco para separação
        }

        scanner.close();
    }
}
