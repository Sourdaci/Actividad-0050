
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
            resultado = 1;
            if(exponente > 0){
                for(int contador = 1; contador <= exponente; contador++){
                    resultado = multiNum(resultado, base);
                }
            }
            // Si los parametros del ejercicio permitieran numeros decimales
            // habria que calcular la potencia de exponente negativo dividiendo
            // Ejemplo: 5^-3 seria 1 / (5*3)
        }
        return resultado;
    }
    
    /**
     * Calculo de raices cuadradas
     * Los numeros negativos son erroneos
     * Las exigencias del ejercicio dicen que los resultados no exactos son erroneos
     * La calculadora esta limitada a 1000
     */
    public int raizCuadrada(int numero){
        int resultado = -1;
        if(numero > -1 || numero < 1001){
            boolean found = false;
            int contador = 0;
            int auxiliar = 0;
            while(!found && auxiliar < 1001){
                auxiliar = multiNum(contador, contador);
                if(auxiliar == numero){
                    found = true;
                    resultado = contador;
                }else{
                    contador++;
                }
            }
            if(!found){
                System.out.println("El numero introducido no tiene raiz cuadrada exacta");
            }
        }else{
            System.out.println("El numero introducido es invalido");
        }
        return resultado;
    }
}
