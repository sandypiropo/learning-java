package aula04;

public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta("Nic", 0.5f, "Azul");
       //c1.setModelo("BIC"); // metodo acessor
      //c1.modelo = "BIC";   // acesso ao atributo
        c1.status();
        Caneta c2 = new Caneta("Lua", 0.7f, "Laranja");
        c2.status();
    }
}
