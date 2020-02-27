public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        // valida que o balance é maior que 0.0; se não for,
        // a variável de instância balance mantém seu valor inicial padrão de 0.0
        if (balance > 0.0) {// se o slado for valido
            this.balance = balance;// o atribui a variavel de instancia balance
        }
    }

    // método que deposita (adiciona) apenas uma quantia válida no saldo
    public void deposit(double depositAmout) {
        if (depositAmout > 0.0) {// se depositAmount for válido
            balance = balance + depositAmout;// o adiciona ao saldo
        }
    }

    // método retorna o saldo da conta
    public double getBalance() {
        return balance;
    }

    // método que define o nome
    public void setName() {
        this.name = name;
    }

    // método que retorna o nome
    public String getName() {
        return name;
    }
}