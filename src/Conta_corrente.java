public class Conta_corrente extends Conta{
    private String nome;
    private int num;

    //CADASTRO DA CONTA
    public void cadastrar(String nome,int num){
        this.nome=nome;
        this.num=num;
        super.setTipo("Corrente");

        System.out.println("--------------------------------------------------");
        System.out.println("Conta registrada.");
        System.out.println("--------------------------------------------------"+"\n");
    }

    //GET DO NOME
    public String getNome() {
        return nome;
    }

    //GET DO NUMERO DA CONTA
    public int getNum() {
        return num;
    }
}
