package controlador;
public class Operaciones {
    private int a;
    private int b;

    public Operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int sumar(){
        return (a+b);
    }
    public int restar(){
        return (a-b);
    } 
    public int dividir(){
        return (a/b);
    } 
    public int multiplicar(){
        return (a*b);
    } 
}