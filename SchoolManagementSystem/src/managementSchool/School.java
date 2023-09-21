package managementSchool;


class Funds {
    private double totalFunds;
    private double expenses;

    public Funds(double totalFunds) {
        this.totalFunds = totalFunds;
        this.expenses = 0.0;
    }

    public void addIncome(double amount) {
        totalFunds += amount;
    }

    public void deductExpenses(double amount) {
        expenses += amount;
    }

    public double calculateRemainingFunds() {
        return totalFunds - expenses;
    }

    @Override
    public String toString() {
        return "Total Funds: $" + totalFunds + ", Expenses: $" + expenses;
    }
}
