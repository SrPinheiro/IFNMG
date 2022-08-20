package questao08;

public class Conta {
    private long numero;
    private double saldo;

    Conta() {
        this.numero = (long) (99999999999L + Math.random() * 999999999999999999L); // gerador de numeros aleatorios

    }

    public boolean depositar(double valor) {
        if (valor >= 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo - valor >= 0) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(Conta conta, double valor) {
        if (this.sacar(valor)) {
            conta.depositar(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return this.numero + "";
    }
}
/*
 * Codigo feito por Leonardo Pinheiro
 * IDE: Intellij IDEA — JetBrains
 * Turma: Info 0121
 * IFNMG — Campus Almenara
 * GitHub: https://github.com/SrPinheiro
 * Data:
 */