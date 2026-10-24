public class supermarket {
    public  String entrar;
    public int qtdProduto = 0;
    public int pagamento;
    //public int pagar;
    public int precoBase = 45;

    public int ContaFinal(int pagar){
        pagar = qtdProduto * precoBase;
        return pagar;
    }


}
