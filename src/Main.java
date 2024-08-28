public class Main {
    public static void main(String[] args) {
        //CONTAS
        Conta_corrente c1=new Conta_corrente();
        Conta_Poupanca c2=new Conta_Poupanca();
        //CAIXA
        Caixa caixa=new Caixa();


        //SALDO
        caixa.ver_saldo(c1);

        //ENTRAR NA CONTA
        caixa.entrar("Carl",32,c1);

        //Registrar Conta
        c1.cadastrar("Carl",32);

        //ENTRAR NA CONTA
        caixa.entrar("Carl",32,c1);

        //SALDO
        caixa.ver_saldo(c1);

        //SAQUE
        caixa.sacar(32.3);


        //DEPOSITO
        caixa.depositar(45.3);

        //SALDO
        caixa.ver_saldo(c1);

        //SAQUE
        caixa.sacar(32.3);

        //SALDO
        caixa.ver_saldo(c1);

    }
}