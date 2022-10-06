public class Main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("Ze Porquinho");

        Conta cc = new ContaCorrente(c1);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(c1);
        cc.transferir(40, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
