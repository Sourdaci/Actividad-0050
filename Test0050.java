
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
        // sacamos el resultado de la division
        int cociente = diviNum(dividendo, divisor);
        // multiplicamos el resultado de la division por el cociente
        int auxiliar = multiNum(cociente, divisor);
        // devolvemos la diferencia entre el dividendo y el resultado de la multiplicacion
        return (dividendo - auxiliar);
        // no hay que retocar el signo de ningun operando, se devolvera siempre el correcto
        // y si el resto es cero, se devuelve bien igualmente
    }
    
    /**
     * Calculo de potencias
     */
    public int potencia(int base, int exponente){
        // potencia: la base se multiplica por si misma tantas veces como indique el exponente
        int resultado = 0;
        if(base != 0){ // cero elevado a algo es siempre cero
            resultado = 1; // algo elevado a cero es siempre uno
            if(exponente > 0){
                // bucle for que multiplica la base por si misma
                for(int contador = 1; contador <= exponente; contador++){
                    resultado = multiNum(resultado, base);
                }
            }
            // Si los parametros del ejercicio permitieran numeros decimales
            // habria que calcular la potencia de exponente negativo dividiendo
            // Ejemplo: 5^-3 seria 1 / (5*5*5)
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
        int resultado = -1; // resultado a devolver por defecto: fuera de rango o no exacto
        if(numero > -1 || numero < 1001){ // comprueba si el numero esta dentro de rango
            boolean found = false; // condicion de salida 1: encontrar la raiz
            int contador = 0; // trabajamos con esta variable como resultado temporal
            int auxiliar = 0; // condicion de salida 2: ser menor que el numero y que 1001
            // no contemplamos que sea igual que el numero porque ya se habra encontrado la raiz
            while(!found && auxiliar < 1001 && auxiliar < numero){
                auxiliar = multiNum(contador, contador); // sacamos el resultado de contador^2
                // se hace con multiplicacion porque ahorra tiempo de ejecucion respecto a potencia
                if(auxiliar == numero){ // si contador^2 es igual al numero, hemos hallado la raiz
                    found = true; // raiz encontrada
                    resultado = contador; // asignamos el valor al resultado para devolverlo
                }else{
                    contador++;
                }
            }
            if(!found){ // si salimos del while y no se ha encontrado la raiz
                System.out.println("El numero introducido no tiene raiz cuadrada exacta");
            }
        }else{ // el println lo explica por si solo
            System.out.println("El numero introducido es invalido [0, 1000]");
        }
        return resultado;
    }
}
