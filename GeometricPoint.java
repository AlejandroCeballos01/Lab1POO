public class GeometricPoint {
    private string name;
    private double x;
    private double y;
    // Constructor
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }
    public Nombre(String name){
        this.name=name;
    }
    //getters
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    //setter nombre de clase
    public void setName(String newName){
        this.name = newName;
    }
    //Punto a string
    public string toString(){
        return "("+ x + ","+ y + ")";
    }
     // devuelve la distancia a otro punto
  public double calcularDistancia(Punto otroPunto) {
    double x1 = x - otroPunto.getX();
    double y1 = y - otroPunto.getY();
    return Math.sqrt(x1 * x1 + y1 * y1);
  }

}