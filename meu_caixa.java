
import java.util.Scanner;
void main(){

    supermarket mkt =  new supermarket();
    var EntradaUsuario = new Scanner(System.in);

    System.out.println("==== Supermercado ====");
    System.out.println("Insira qualquer palavra para iniciar ou 'fechar' pra encerrar a compra");
    mkt.entrar = EntradaUsuario.next();

    while(!mkt.entrar.equals("fechar")){
        System.out.println("Insira um produto para contabilizar a compra ou digite fechar para prosseguir para o pagamento");
        mkt.entrar = EntradaUsuario.next();

        mkt.qtdProduto++;
        System.out.println("produto debitado: " + mkt.entrar);
        System.out.println("qtd produto: " + mkt.qtdProduto);

    }
    System.out.println("Como deseja efetuar esse pagamento");
    System.out.println("1) cartão credito");
    System.out.println("2) dinheiro");
    System.out.println("3) Pix");

    mkt.pagamento =  EntradaUsuario.nextInt();

    switch (mkt.pagamento){
        case 1:{
            System.out.println("Pagar no cartão de credito");
            System.out.println("Valor total de sua compra" );
            System.out.println(mkt.ContaFinal(mkt.qtdProduto));
            break;
        }
        case 2:{
            System.out.println("Pagar no dinheiro");
            break;
        }
        case 3:{
            System.out.println("Pagar no pix");
            break;
        }
        default:{
            System.out.println("Informação invalida tente novamente");
            break;
        }
    }

}