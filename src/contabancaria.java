public class contabancaria {

    public String name;
    public double balance;
    public double interestRate;

    public contabancaria(String name, double balance, double interestRate) {
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposito (double valordeposito){
        balance += valordeposito;
    }

    public void saqueBancario(double valorSaque){
        if (valorSaque > balance) {
            System.out.println("Saldo Negativo");
        }
        else {
            balance -= valorSaque;
        }
    }
}
