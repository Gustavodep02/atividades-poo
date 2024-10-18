public class Caixa{
    private double saldo;

    public Caixa(double saldo){
        this.saldo = saldo;
    }

    public double venda(double []valor){
        int tamanho = valor.length;
        for(int i = 0; i<tamanho;i++){
        this.saldo+=valor[i];
        }
        return this.saldo;
    }
}