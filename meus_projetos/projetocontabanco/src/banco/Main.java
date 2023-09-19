package banco;

public class Main {
    public static void main(String[] args) {
        ContaBanco usuario1 = new ContaBanco();
        usuario1.setNumConta(1111);
        usuario1.abrirConta("CC");
        usuario1.setDonoConta("Andre");


        ContaBanco usuario2 = new ContaBanco();
        usuario2.setNumConta(2222);
        usuario2.setDonoConta("Julia");
        usuario2.abrirConta("CP");

        usuario1.depositar(100);
        usuario2.depositar(500);
        usuario2.sacar(100);
        usuario1.sacar(150);
        usuario1.fecharConta();

        usuario1.estadoAtual();
        usuario2.estadoAtual();

    }
}

