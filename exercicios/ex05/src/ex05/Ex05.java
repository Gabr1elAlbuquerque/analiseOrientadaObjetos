package ex05;

public class Ex05 {


    public static void main(String[] args) {
       Pessoa p1 = new Pessoa();
      // p1.nome = "Gabriel"; esse código gera um erro, pois o atributo é private, sendo assim não é possivel modificá-lo fora da classe
      //ATRIBUTOS PRIVATE E METODOS PUBLIC SEMPRE! É UMA BOA PRÁTICA
       p1.setNome("Gabriel");
    }
    
}
