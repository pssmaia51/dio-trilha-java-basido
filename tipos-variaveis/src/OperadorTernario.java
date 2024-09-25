public class OperadorTernario {

    public static void main(String[] args) {
        
        // Declaração e inicialização de variáveis
        int a = 5;
        int b = 6;
        String resultado;

        // exemplo de condicional utilizando IF/ELSE
        if (a == b) {
            resultado = "Verdadeiro";
        } else {
            resultado = "Falso";
        }

        // Exibe o resultado
        System.out.println("Resultado com IF/ELSE: " + resultado);

        // Exemplo utilizando operador ternário
        resultado = (a == b) ? "Verdadeiro" : "Falso";

        // Exibe o resultado
        System.out.println("Resultado com operador ternário: " + resultado);
    }
}

