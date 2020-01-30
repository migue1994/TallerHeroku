package edu.escuelaing.arem.designprimer.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que se encarga de realizar la lógica del programa, para mostrar los resultados finales
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operations{

    private LinkedList<Double> datos;

    /**
     * Se encarga de calcular la media de los datos almacenados en la LinkedList
     * @return Double que contiene la media de los datos de la LinkedList
     */
    public double getMean(){
        double mean = 0;
        for (int i = 0; i < this.datos.size(); i++){
            mean += this.datos.get(i);
        }
        return mean/this.datos.size();
    }

    /**
     * Se encarga de calcular la desviación estandar de los datos almacenados en la LinkedList
     * @return Un Double que contiene el resultado de la desviación estandar de los datos que están
     * en la LinkedList
     */
    public double getStandardDeviation(){
        double ans = 0;
        double avg = getMean();
        for (int i = 0; i < this.datos.size(); i++){
            ans += Math.pow((this.datos.get(i) - avg),2);
        }
        ans /= this.datos.size()-1;
        ans = Math.sqrt(ans);
        return ans;
    }

    /**
     * Se encarga de convertir los datos que hay dentro de un string y almacenarlos en la LinkedList
     * @param valores String que contiene los datos que vana ser procesados
     */
    public void createDatos(String valores){
        this.datos = new LinkedList<>();
        String[] splitValores = valores.split(",");
        for (String s : splitValores){
            this.datos.add(Double.parseDouble(s));
        }
    }

}