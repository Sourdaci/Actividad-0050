
/**
 * Actividad 0050
 * Por exigencias de realizacion, solo esta permitido operar con sumas y restas
 * Los resultados devueltos son numeros enteros
 */
public class Test0050{
    /**
     * Constructor for objects of class Test0050
     */
    
    // no se necesita almacenar ninguna informacion durante la ejecucion del programa
    
    public Test0050(){
        // Todo se hace con parametros y variables locales, no hay atributos para inicializar
    }
    
    /**
     * Multiplica 2 numeros enteros
     */
    public int multiNum(int base, int aumento){
        int resultado = 0; // resultado por defecto si algun operando es cero
        if(base != 0){// cero por algo es cero, descartamos la base cero para evitar calculos
            if(aumento > 0){// si el factor multiplicador es positivo
                // el bucle va avanzando hacia delante hasta que el contador alcance al aumento
                for (int contador = 1; contador <= aumento; contador++){
                    // sumamos la base al resultado
                    resultado += base;
                }
                // con base positiva el resultado sera positivo, con negativa sera negativo
            }else if(aumento < 0){// si el factor multiplicador es negativo
                // el bucle va avanzando hacia atras hasta que el contador alcance al aumento
                for (int contador = -1; contador >= aumento; contador--){
                    // sumamos la base con signo cambiado al resultado
                    resultado += -base;
                }
                // con base positiva el resultado sera negativo, con negativa sera positivo
            }
            // algo por cero es indeterminacion, si se da el caso se escoge el resultado cero
        }
        return resultado;
    }
    
    /**
     * Divide 2 numeros enteros
     */
    public int diviNum(int dividendo, int divisor){
        int contador = 0; // resultado por defecto si algun operando es cero
        if(dividendo > 0){ // dividendo positivo
            int auxiliar = dividendo; // guardamos el dividendo
            if(divisor > 0){ // division de numeros positivos
                // se restara el divisor hasta que el auxiliar sea menor
                while(auxiliar >= divisor){
                    auxiliar -= divisor;
                    contador++; // incremento
                }
                // resultado positivo
            }else if(divisor < 0){ // divisor negativo
                // se resta el positivo del divisor al auxiliar
                while(auxiliar >= -divisor){ // se compara el inverso del divisor: positivo
                    auxiliar -= -divisor;
                    contador--; // decremento
                }
                // resultado negativo
            }
        }else if(dividendo < 0){ // dividendo negativo
            int auxiliar = -dividendo; // guardamos el inverso del dividendo
            if(divisor > 0){ // divisor positivo
                // se restara el divisor hasta que el auxiliar sea menor
                while(auxiliar >= divisor){
                    auxiliar -= divisor;
                    contador--; // decremento
                }
                // resultado negativo
            }else if(divisor < 0){ // division de numeros negativos
                // se resta el positivo del divisor al auxiliar
                while(auxiliar >= -divisor){ // se compara el inverso del divisor: positivo
                    auxiliar -= -divisor;
                    contador++; // incremento
                }
                // resultado positivo
            }
        }
        return contador;
    }
    
    /**
     * Divide 2 numeros enteros y calcula el resto
     */
    public int resto(int dividendo, int divisor){
        int auxiliar = 0;
        if(dividendo > 0){
            auxiliar = dividendo;
            if(divisor > 0){
                while(auxiliar >= divisor){
                    auxiliar -= divisor;
                }
            }else if(divisor < 0){
                while(auxiliar >= -divisor){
                    auxiliar -= -divisor;
                }
            }
        }else if(dividendo < 0){
            auxiliar = -dividendo;
            if(divisor > 0){
                while(auxiliar >= divisor){
                    auxiliar -= divisor;
                }
            }else if(divisor < 0){
                while(auxiliar >= -divisor){
                    auxiliar -= -divisor;
                }
            }
            auxiliar = -auxiliar;
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
