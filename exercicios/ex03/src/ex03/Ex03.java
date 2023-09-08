package ex03;

public class Ex03 {

    
    public static void main(String[] args) {
        int dia = 7;
        switch (dia) {
            case 0:
                System.out.printf("Domingo\n");
                break;
            case 1:
                System.out.printf("Segunda-Feira\n");
                break;
            case 2:
                System.out.printf("Terça-Feira\n");
                break;
            case 3:
                System.out.printf("Quarta-Feira\n");
                break;
            case 4:
                System.out.printf("Quinta-Feira\n");
                break;
            case 5:
                System.out.printf("Sexta-Feira\n");
                break;
            default:
                System.out.printf("Sábado\n");
                break;
        }
    }
    
}
