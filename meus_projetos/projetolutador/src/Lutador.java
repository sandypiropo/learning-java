public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrota;
    private int empates;

    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrota = de;
        this.empates = em;
    }

    public void apresentar(){
        System.out.println("Chegou a hora! Apresentando o lutador " + this.getNome());
        System.out.println("Nacionalidade = " + this.getNacionalidade());
        System.out.println("Idade = " + this.getIdade() + " anos e " + this.getAltura());
        System.out.println("Pesando = " + this.getPeso() + "Kg");
    }

    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrota() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrota(this.getDerrota() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }


    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {

        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {

        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }

    public double getAltura() {

        return altura;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    public double getPeso() {

        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso <52.2){
            this.categoria = "Inválido";
        } else if(this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        }else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
