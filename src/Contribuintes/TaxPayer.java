package Contribuintes;

public class TaxPayer {
    private double salaryIncome;
    private double servicesIncome;
    private double capitalIncome;
    private double healthSpending;
    private double educationSpending;

    public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending, double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    // Getters e Setters
    public double getSalaryIncome() {
        return salaryIncome;
    }

    public void setSalaryIncome(double salaryIncome) {
        this.salaryIncome = salaryIncome;
    }

    public double getServicesIncome() {
        return servicesIncome;
    }

    public void setServicesIncome(double servicesIncome) {
        this.servicesIncome = servicesIncome;
    }

    public double getCapitalIncome() {
        return capitalIncome;
    }

    public void setCapitalIncome(double capitalIncome) {
        this.capitalIncome = capitalIncome;
    }

    public double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(double healthSpending) {
        this.healthSpending = healthSpending;
    }

    public double getEducationSpending() {
        return educationSpending;
    }

    public void setEducationSpending(double educationSpending) {
        this.educationSpending = educationSpending;
    }

    // Métodos de cálculo de impostos
    public double salaryTax() {
        double monthlyIncome = getSalaryIncome() / 12; // Usa o getter para obter a renda
        if (monthlyIncome < 3000) {
            return 0; // Isento de imposto
        } else if (monthlyIncome < 5000) {
            return getSalaryIncome() * 0.10; // Imposto de 10%
        } else {
            return getSalaryIncome() * 0.20; // Imposto de 20%
        }
    }

    public double servicesTax() {
        return getServicesIncome() * 0.15; // Usa o getter para obter a renda de serviços
    }

    public double capitalTax() {
        return getCapitalIncome() * 0.20; // Usa o getter para obter a renda de capital
    }

    public double grossTax() {
        return salaryTax() + servicesTax() + capitalTax(); // Calcula o imposto bruto
    }

    public double taxRebate() {
        double totalSpending = getHealthSpending() + getEducationSpending(); // Usa getters para obter os gastos
        double maxRebate = grossTax() * 0.30; // Cálculo do máximo reembolso
        return Math.min(totalSpending, maxRebate); // Retorna o menor valor entre gastos e máximo reembolso
    }

    public double netTax() {
        return grossTax() - taxRebate(); // Calcula o imposto líquido
    }
}
