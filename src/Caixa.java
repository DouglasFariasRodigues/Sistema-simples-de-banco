public class Caixa {
    boolean acesso = false;
    private double saldo=0.0;

    //VERIFICAÇÃO DE CONTA
    public void entrar(String nome,int num,Conta_corrente conta){
        if (nome == conta.getNome()){
            if(num== conta.getNum()){
                this.acesso=true;
            }
            else{
                this.acesso=false;
            }
        }
        else {
            acesso=false;
        }
    }

    //MOSTRAR SALDO
    public void ver_saldo(Conta conta){
        if (this.acesso==true){
            System.out.println("--------------------------------------------------");
            System.out.println("Saldo: "+this.saldo +"\n"+"Conta-"+conta.getTipo());
            System.out.println("--------------------------------------------------"+"\n");
        }
        else {
            System.out.println("--------------------------------------------------");
            System.out.println("Verifique seus dados e tente novamente.");
            System.out.println("--------------------------------------------------"+"\n");
        }
    }

    //DEPOSITA DINHEIRO NA CONTA
    public void depositar(double valor){
        if (this.acesso==true){
            this.saldo+=valor;
        }
        //Sem acesso
        else {
            System.out.println("--------------------------------------------------");
            System.out.println("Você não tem acesso.");
            System.out.println("--------------------------------------------------"+"\n");
        }
    }

    //RETIRA DINHEIRO DO SALDO
    public void sacar(double valor) {
        if (this.acesso == true) {
            if (this.saldo > 0.0) {
                this.saldo -= valor;
            }
            else {
                System.out.println("--------------------------------------------------");
                System.out.println("Você não tem Saldo");
                System.out.println("--------------------------------------------------"+"\n");
            }
        }

        //sem acesso
        else{
            System.out.println("--------------------------------------------------");
            System.out.println("Você não tem acesso.");
            System.out.println("--------------------------------------------------"+"\n");
        }

    }




}
