
/**
 * Actividad 0050
 * Por exigencias de realizacion, solo esta permitido operar con sumas y restas
 * Los resultados devueltos son numeros enteros
 */
public class Test0050{
    /**
     * Constructor for objects of class Test0050
     */
    public Test0050(){
    }
    
    /**
     * Multiplica 2 numeros enteros
     */
    public int multiNum(int base, int aumento){
        int resultado = 0;
        if(base != 0){
            if(aumento > 0){
                for (int contador = 1; contador <= aumento; contador++){
                    resultado += base;
                }
            }else if(aumento < 0){
                for (int contador = -1; contador >= aumento; contador--){
                    resultado += -base;
                }
            }
        }
        return resultado;
    }
    
    /**
     * Divide 2 numeros enteros
     */
    public int diviNum(int dividendo, int divisor){
        int contador = 0;
        if(dividendo > 0){
            int auxiliar = dividendo;
            if(divisor > 0){
                while(auxiliar >= divisor){
                    auxiliar -= divisor;
                    contador++;
                }
            }else if(divisor < 0){
                while(auxiliar >= -divisor){
                    auxiliar -= -divisor;
                    contador--;
                }
            }
        }else if(dividendo < 0){
            int auxiliar = -dividendo;
            if(divisor > 0){
                while(auxiliar >= divisor){
                    auxiliar -= divisor;
                    contador--;
                }
            }else if(divisor < 0){
                while(auxiliar >= -divisor){
                    auxiliar -= -divisor;
                    contador++;
                }
            }
        }
        return contador;
    }
    
    /**
     * Divide 2 numeros enteros y calcula el resto
     */
    public int resto(int dividendo, int divisor){
        int contador = 0;
        int auxiliar = 0;
        if(dividendo > 0){
            auxiliar = dividendo;
            if(divisor > 0){
                while(auxiliar >= divisor){
                    auxiliar -= divisor;
                    contador++;
                }
            }else if(divisor < 0){
                while(auxiliar >= -divisor){
                    auxiliar -= -divisor;
                    contador--;
                }
                auxiliar = -auxiliar;
            }
        }else if(dividendo < 0){
            auxiliar = -dividendo;
            if(divisor > 0){
                while(auxiliar >= divisor){
                    auxiliar -= divisor;
                    contador--;
                }
                auxiliar = -auxiliar;
            }else if(divisor < 0){
                while(auxiliar >= -divisor){
                    auxiliar -= -divisor;
                    contador++;
                }
            }
        }
        return auxiliar;
    }
    
    /**
     * Calculo de potencias
     */
    public int potencia(int base, int exponente){
        int resultado = 0;
        if(base != 0){
            if(exponente > 0){
                resultado = 1;
                for(int contador = 1; contador <= exponente; contador++){
                    resultado = multiNum(resultado, base);
                }
            }else{
                resultado = 1;
                // Si los parametros del ejercicio permitieran numeros decimales
                // habria que calcular la potencia dividiendo
                // Ejemplo: 5^-3 seria 1 / (5*3)
            }
        }
        return resultado;
    }
}
