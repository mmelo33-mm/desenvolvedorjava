import java.util.Scanner; // importar uma classe externa
import java.io.IOException;

public class AppEscola {
    // public = publico
    // static = da classe
    // void = retorno vazio
    // main = principal
    // String args[] = parametro inicial
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = teclado.nextLine();
        System.out.println("Digite sua idade");
        int idade = teclado.nextInt();
        System.out.println("Tem faculdade? 0 = não e 1 = sim");
        int faculdade = teclado.nextInt();
        
        boolean temFaculdade = faculdade == 1;





        //metodo principal

        //Classe objeto = new Construto(parametros);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Tem faculdade? " + (temFaculdade ? "Sim" : "Não"));

        
        
    
    }

}

