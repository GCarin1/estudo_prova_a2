import javax.swing.JOptionPane;
import java.util.Scanner;

public class estudos_provaA2 {
    public static void main(String[] args) throws Exception {
//Variaveis

        int n1,q,tamannho_vetor=10;
        float n2;
        double n3;
//vetor
        int vetor[] = new int[tamannho_vetor];   
//While
        while(true){
            q=Integer.parseInt(JOptionPane.showInputDialog(null, "1 Joption 2 Scanner:"));
//Switch Case
            switch (q) {
                
                case 1:
                //JOptionpane interface para inserir e ver dados
                n1=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Numero Inteiro 1: "));
                n2 = Float.parseFloat(JOptionPane.showInputDialog (null, "Digite o numero Float 2: ", "Dado",
                JOptionPane.INFORMATION_MESSAGE) );
                n3=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Numero Double 3: ","Dado",
                JOptionPane.INFORMATION_MESSAGE));
                JOptionPane.showMessageDialog (null, "Numeros: " +n1+n2+n3, "Numeros",JOptionPane.INFORMATION_MESSAGE);

//IF
                if(n1>=n2){
                    n3=n2*3;
                    System.out.println(n3);
                }
                else{
                    break;
                }

                case 2:
                //Scannner
                Scanner sc = new Scanner(System.in);

                System.out.println("Entre com o numero 1: ");
                n1=sc.nextInt();
                System.out.println("Entre com o numero 2: ");
                n2=sc.nextFloat();
                System.out.println("Entre com o numero 2: ");
                n3=sc.nextDouble();
                sc.close();
                
                for(int i=0;i<=vetor.length;i++){
                    n1++;
                    n2--;
                    n3=n1+n2;
                    vetor[i]=n1;
                    System.out.println("Rodada:  "+i);
                    System.out.println("Numerosn1:  "+n1);
                    System.out.println("Numerosn2:  "+n2);
                    System.out.println("Numerosn3:  "+n3);
                }
                System.out.println("Numeros:  "+n1+n2+n3);

                
                break;
            }
            if(q!=1 || q!=2){
                System.out.println("Parou");
                break;
            }
        }

    }
}

