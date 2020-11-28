
package u3e3;

public class Pila {
    NodoPila cima;
    int tamaño=0;
    
    public void Empujar(int palabra){
        NodoPila nodo=new NodoPila(palabra);
        
        nodo.siguiente=cima;
        cima=nodo;
        tamaño++;
    }
    
    public void SacarPila(){
         //int auxiliar=cima.elemento;
        if(tamaño==0){
            System.out.println("La pila esta vacía");
        }else{   
        cima=cima.siguiente;
        tamaño--;
        }//return auxiliar;
    }
    
    public void MostrarPila(){
        NodoPila recorre=cima;
        while(recorre!=null){
            System.out.println(recorre.elemento);
            recorre=recorre.siguiente;
        }
    }
}
