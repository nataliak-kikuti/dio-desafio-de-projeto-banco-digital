public class Main {
    public static void main(String[] args) {
        Cliente natalia = new Cliente();
        natalia.setNome("Natalia");
        Conta cc = new ContaCorrente(natalia);
        Conta poupanca = new ContaPoupanca(natalia);

        cc.depositar(12);
        cc.transferir(1, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();




    }
}
