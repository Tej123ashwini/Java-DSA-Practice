package ExpenseTracker;

class Expense {
    int id;
    String desc;
    double amount;
    String category;

    public Expense(int id, String desc, double amount, String category) {
        this.id = id;
        this.desc = desc;
        this.amount = amount;
        this.category = category;
    }
}