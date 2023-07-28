public class App {
    public static void main(String[] args) throws Exception {
    
        //Operador de atribuição =
        int valor = 10;
        char sexo = 'M';

        //operadores aritiméticos +, -, *, / e %

        int soma =  10 +2;
        int subtracao = 10 - 2;
        int multiplicacao = 10 * 2;
        int divisao = 10 / 2;
        int modulo = 10 % 2;

        //O operador de soma(+) usado em variáveis do tipo texto serve para concatenar textos

        String nomeCompleto = "Christian " + "Lopes de Oliveira";
        System.out.println(nomeCompleto);

        //Operador unário 
        int numero = 5;
        numero = -numero;
        System.out.println(numero);

        numero = numero * (+1);
        System.out.println(numero);

        int count = 5;

        count++;
        System.out.println(count);

        System.out.println(++count);

        boolean variavel = true;
        System.out.println(!variavel);

        //Operador ternário

        int a, b;
        a = 4;
        b = 5;

        String resultado = a == b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        //Operadores relacionais

        int num1, num2;
        num1 = 1;
        num2 = 2;

        boolean teste = num1 == num2;
        System.out.println("São iguais: " + teste);

        teste = num1 != num2;
        System.out.println("São diferentes: " + teste);

        teste = num1 >= num2;
        System.out.println("Maior ou igual: " + teste);

        teste = num1 <= num2;
        System.out.println("Menor ou igual: " + teste);

        //Operadores lógicos

        boolean condicao = true;
        boolean condicao2 = false;

        if(condicao && condicao2){
            System.out.println("As duas são verdadeiras.");
        }

        if(condicao || condicao2){
            System.out.println("Uma das condições é verdadeira.");
        }

        System.out.println("Fim");
    }
}
