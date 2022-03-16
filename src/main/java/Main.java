
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 
 */
public class Main {
    
    public static void main(String args[]){
        
        ArabicToCardinalConvertor Conver = new ArabicToCardinalConvertor();
        String text = "", number = "";
        Scanner sc= new Scanner(System.in);
        System.out.printf("Para detener las conversiones teclee la palabra \"alto\" \n");
        while(number != "alto") {
            System.out.printf("Teclee el numero a convertir: \n");
            number = sc.nextLine(); 
            if(number.contains("alto")){
                break;
            }
            else{
                text = Conver.getConversion(number);
                System.out.print(text + "\n");
            }
        }
        
        
        
    }
    
}
