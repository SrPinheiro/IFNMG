public class Principal {
    public static void main(String[] args) {
        Conta LariGirl = new Conta("Larissa");

        LariGirl.depositar(500);
        System.out.println(LariGirl.getNumeroDaConta());
        System.out.println(LariGirl.getSaldo());
    }
}
