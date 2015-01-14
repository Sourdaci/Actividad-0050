
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
                for (int contador = 1;contador <= aumento; contador++){
                    resultado += base;
                }
            }else if(aumento < 0){
                for (int contador = -1;contador >= aumento; contador--){
                    resultado += -base;
                }
            }
        }
        return resultado;
    }
}
