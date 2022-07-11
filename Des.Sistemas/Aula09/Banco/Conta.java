public class Conta {
    private String titular;
    private Double saldo;
    private int numeroDaConta;

    Conta(String nome){
        this.titular = nome;
        this.numeroDaConta  = (int) (1000000+ Math.random() * 5485489);
    }
    void depositar(double valor){
        if(valor > 0) {
            this.saldo = valor;
        }
    }

    Double getSaldo() {
        return saldo;
    }
    int getNumeroDaConta() {
        return numeroDaConta;
    }
    void sacar(double valor){
        if(valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
        }
    }

}
