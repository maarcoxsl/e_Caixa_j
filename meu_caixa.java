import java.util.Scanner;
void main(){
    var EntradaUsuario = new Scanner(System.in);

    System.out.println("Olá diga o seu nome");
    var Codigo_usuario = EntradaUsuario.next();


    System.out.println("Digite o seu saldo bancario desejado : ");
    var Saldo_usuario = EntradaUsuario.nextLong();

    if(Saldo_usuario >= 100 && Saldo_usuario <= 999){
        System.out.println("Olá:"+ Codigo_usuario + "Seu Saldo é medio: " + Saldo_usuario);

    } else if (Saldo_usuario >= 1000 && Saldo_usuario < 2000){
        System.out.println("Olá:"+ " " + Codigo_usuario + " " + "Seu saldo é baixo: " + Saldo_usuario);
    } else if (Saldo_usuario >= 2100) {
        System.out.println("Olá: "+ Codigo_usuario + "Seu saldo é alto" + Saldo_usuario);
    } else{
        System.out.println("Nenhum valor foi informado");
    }

}