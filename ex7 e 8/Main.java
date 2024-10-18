public class Main{
    public static void main(String[] args){
        Caixa c1 = new Caixa(123.50);
        double[] valores = new double[args.length];
        for (int i = 0; i < args.length; i++) {
                valores[i] = Double.parseDouble(args[i]);
        }
            double saldo = c1.venda(valores);
            System.out.println(saldo);
        
    }
}