package aula13;

public class operadoresAritmeticos {
    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado -= 1;
        System.out.println(resultado);

        resultado *= 2;
        System.out.println(resultado);

        resultado /= 2;
        System.out.println(resultado);

        resultado += 8;
        System.out.println(resultado);

        resultado %= 7;
        System.out.println(resultado);

        String primeiroNome = "Esta é";
        String segundoNome = " uma string concatenada";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        resultado += 1;
        System.out.println(resultado);

        resultado++;  //add 1
        System.out.println(resultado);

        // 5
        System.out.println(resultado++); // 5
        // mesma coisa que
        //System.out.println(resultado);
        //resultado += 1;

        System.out.println(++resultado); // 7
        // mesma coisa que
        //resultado += 1;
        //System.out.println(resultado);

        resultado--;
        System.out.println(resultado);
        System.out.println(resultado--);
        System.out.println(--resultado);
    }
}
