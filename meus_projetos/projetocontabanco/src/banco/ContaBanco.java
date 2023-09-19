package banco;

public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void estadoAtual(){
        System.out.println("---------------------------------------");
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipoConta());
        System.out.println("Dono da conta: " + this.getDonoConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String tipo){
        this.setTipoConta(tipo);
        this.setStatus(true);
        if(tipo == "CC") {
            this.setSaldo(50);
        } else if (tipo == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){
            if(this.getSaldo() > 0) {
                System.out.println("Não pode fechar com dinheiro na conta");
            } else if (this.getSaldo() < 0){
                System.out.println("Conta tá em débito");
            } else {
            this.setStatus(false);
                System.out.println("Fechada!");
            }
    }

    public void depositar(double valor) {
        if(this.getStatus()){
            //this.saldo = this.saldo + valor
            this.setSaldo(getSaldo() + valor);
            System.out.println("Deposito realizado na conta de " + this.getDonoConta());
        } else {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(double valor) {
        if(this.getStatus()) {
            if(this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDonoConta());
            } else {
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Impossivel sacar");
        }
    }

    public void pagarMensalidade() {
        int taxa = 0;
        if(this.getTipoConta() == "CC") {
            taxa = 12;
        } else if (this.getTipoConta() == "CP") {
            taxa = 20;
        }

        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - taxa);
        System.out.println("PAGO!");
        } else {
            System.out.println("Impossivel pagar mensalidade");
        }
    }

    // ----------------------------------------------
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setTipoConta(String tipo) {
        this.tipoConta = tipo;
    }

    public String getDonoConta() {
        return this.donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // ---------------------------------------------------

}
