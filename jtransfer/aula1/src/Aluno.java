

//ler sobre classes Wrappers



/*encapsulamento*/
// public
// private
// protected
// package 
public class Aluno { //classe

    //variaveis, na orientação a objetos = atributos
    //caracteristicas
    private String nome; //atributo tipo texto
    private int idade; //atributo tipo numero
    private boolean temFaculdade; //atibuto do tipo Booleano (0 e 1)

    public Aluno(){


    }


    public Aluno(String nome, int idade, boolean temFaculdade){
        this.nome = nome;
        this.idade = idade;
        this.temFaculdade = temFaculdade;

    }

//metodo é a ação do objeto, como o exemplo do CSGO
public String getNome(){ //metodo para pegar o nome
    return nome;

}


public int getIdade(){ //metodo para pegar a idade
    return idade;

}


public boolean getTemFaculdade(){ //metodo para pegar se tem faculdade
    return temFaculdade;

}


    

}
