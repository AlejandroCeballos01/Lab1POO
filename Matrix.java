import java.util.LinkedList;

public class Matrix{
    private LinkedList<GeometricPoint> = new LinkedList<GeometricPoint>();
    private LinkedList<LinkedList<Double>> matrix = new LinkedList<LinkedList<Double>>();

    public Matrix(){}

    public LinkedList<GeometricPoint> getCities() {
        return cities;
    }

    public void addCities(GeometricPoint city){
        cities.add(city);
        int cityCounter = cities.size()-1;
        LinkedList<Dobule> distanciaTemp = new LinkedList<Dobule>();
        for(int count=0; count<cities.size();count++){
            double distancia = computeDistanceMatrix(city,count);
            distanciaTemp.add(distancia);
        }
        matrix.add(cityCounter,distanciaTemp)
    }

    public string getCityName(city);
    return this.name
    }
    getNoOfCities(){
        return cities.size()-1;
    }
    public void createDistanceMatrix(){

    }
    public double getDistance(int index1, int index2){
        
    }