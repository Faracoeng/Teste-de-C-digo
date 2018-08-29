package POO;

public class Triangulo {
    public String tipo(int a, int b, int c){

        else if(a == b && b == c){
            return "É um triângulo Equilátero";
        }

        else if (a != b && b == c) {
            return "É um triângulo Isósceles";  // erro pode estar aq
        }

        else if (a == b && a != c) {
          return "É um triângulo Isósceles";
        }

        if (a == c && b != c) {
          return "É um triângulo Isósceles";
        }

        return "Não é um triângulo";
    }
}
