import java.util.Scanner;

public class RNA {
    
    public static void main(String[] args) {
    	
        System.out.println("Please enter your DNA string");
        
        Scanner Sc = new Scanner(System.in);
       
        String DNA = Sc.nextLine();
        String RNA = "";
       for(int x=0;x<=DNA.length()-1;x++)
        {
        char p = DNA.charAt(x);
        
        switch (p) {
        case 'A':RNA += 'U';break;
        case 'G':RNA += 'C';break;
        case 'C':RNA += 'G';break;
        case 'T':RNA += 'A';break;
        default: System.out.println("One of these was not an acceptable letter");
        }
        }
       
        System.out.println("Here is your RNA string");
    
        System.out.println(RNA);
                
            }
        

    }



