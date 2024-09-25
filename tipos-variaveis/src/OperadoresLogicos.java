public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        // usando condição E (and) &&
        if (condicao1 && condicao2){
            System.out.println("As duas condiçoes são verdadeiras");
        }
        if (condicao1 || condicao2){
            System.out.println("Uma das duas condiçoes é verdadeiras");
        }

        if (condicao1 && ( 7 > 4 )){
            System.out.println("As duas condiçoes são verdadeiras");
        }

        if (condicao1 || (7 != 4)){
            System.out.println("Uma das duas condiçoes é verdadeiras");
        }

        System.out.println("Fim");
    }
    
}
