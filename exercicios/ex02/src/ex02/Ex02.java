package ex02;

import javax.swing.JOptionPane;

public class Ex02 {

    public static void main(String[] args) {
       int frequencia = (int) Float.parseFloat(JOptionPane.showInputDialog("Digite a frequencia: "));
       
       String situacao = (frequencia >= 75)?"Aprovado" : "Reprovado"; //if else em uma linha
       
       if(situacao.equals("Aprovado")){
           JOptionPane.showMessageDialog(null, situacao, "Situacao", 3);
       }
       else{
           JOptionPane.showMessageDialog(null, situacao, "Situacao", 0);
       }
    }
    
}
