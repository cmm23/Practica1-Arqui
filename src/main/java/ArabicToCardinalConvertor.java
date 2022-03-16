/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 
 */
public class ArabicToCardinalConvertor extends Converter {
    
    private String finalString = "";
    
    @Override
    public void validateString(String cadena) {
        
    }

    @Override
    public String getConversion(String cadena) {
        finalString = "";
        int length = cadena.length();
        
        for(int i=0; i<length; i++) {
            char number = cadena.charAt(i);
            
            // millares
            if(i == 0 && length == 4){
                switch(number){
                    case '0':
                        break;
                    case '1':
                        finalString = "mil ";
                        break;
                    default:
                        finalString = getUnits(number) + " mil ";
                        break;
                }
            }
            
            // centenas
            else if( (i == 1 && length == 4) || (i == 0 && length == 3)){
                switch(number){
                    case '0':
                        break;
                    case '1':
                        if (cadena.charAt(length-1) == '0' & cadena.charAt(length-2) == '0'){
                            finalString += "cien";
                            return finalString;
                        }
                        else {
                            finalString += "ciento ";
                        }
                        break;
                    case '5':
                        finalString += "quinientos ";
                        break;
                    case '7':
                        finalString += "setecientos ";
                        break;
                    case '9':
                        finalString += "novecientos ";
                        break;
                    default:
                        finalString += getUnits(number) + "cientos ";
                        break;
                }
            }
            
            // decenas
            else if ((i == 2 && length == 4) || (i == 1 && length == 3) || (i == 0 && length == 2)){
                String tens = "";
                char unit = cadena.charAt(length-1);
                switch(number){
                    case '0':
                        break;
                    case '1':
                        finalString += getTens(unit);
                        return finalString;
                    case '2':
                        if(unit == '0'){
                            finalString += "veinte";
                        }
                        else {
                            finalString += "veinti" + getUnits(unit);
                        }
                        return finalString;
                    case '3':
                        finalString += "treinta ";
                        break;
                    case '4':
                        finalString += "cuarenta ";
                        break;
                    case '5':
                        finalString += "cincuenta ";
                        break;
                    case '6':
                        finalString += "sesenta ";
                        break;
                    case '7':
                        finalString += "setenta ";
                        break;
                    case '8':
                        finalString += "ochenta ";
                        break;
                    case '9':
                        finalString += "noventa ";
                }
                if (unit != '0' && number != '0'){
                    finalString += " y " + getUnits(unit);
                    return finalString;
                }
            }
            
            //unidades
            else {
                if((number != '0' && length > 1) || length == 1){
                    finalString += getUnits(number);
                }
            }
        }
        
        return finalString;
    }
    
    public String getTens(char number){
        switch(number){
            case '0':
                return "diez";
            case '1':
                return "once";
            case '2':
                return "doce";
            case '3':
                return "trece";
            case '4':
                return "catorce";
            case '5':
                return "quince";
            default:
                return ("dieci" + getUnits(number));
        }
    }
    
    public String getUnits(char number){
        switch(number) {
            case '0':
                return "cero";
            case '1':
                return "uno";
            case '2':
                return "dos";
            case '3':
                return "tres";
            case '4':
                return "cuatro";
            case '5':
                return "cinco";
            case '6':
                return "seis";
            case '7':
                return "siete";
            case '8':
                return "ocho";
            case '9':
                return "nueve";
        }
        return "";
    }
    
    
}
