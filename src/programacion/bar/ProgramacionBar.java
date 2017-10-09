
package programacion.bar;
import java.util.Scanner;
public class ProgramacionBar {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
                int cocacolas, agua;
        float entregado, devolto, total,pcocacolas=7.5f,pagua=2.3f;
        String nome="Bar", agradecimiento= "Grazas por vir";
      
        
        System.out.println("cocacolas");
        cocacolas= sc.nextInt();
        System.out.println("aguas");
        agua=sc.nextInt();
        total=cocacolas*pcocacolas+pagua*agua;
        System.out.println("dinero entregado");
        entregado= sc.nextFloat();
        devolto= entregado-total;
        System.out.println(nome);
        System.out.println("cocacolas = "+cocacolas+"\naguas = "+agua+"\ntotal = "+total+"\nentregado = "+entregado+"\ndevolto = "+devolto+"\n"+agradecimiento); 
        
    }
    
}
