package edu.escuelaing.arem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.escuelaing.arem.designprimer.Entities.Operations;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Operations o = new Operations();

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void calcularMedia(){
        o.createDatos("160,591,114,229,230,270,128,1657,624,1503");
        assertEquals(550.6, o.getMean(),0.1);
    }

    @Test
    public void calcularDesviacionEstandar(){
        o.createDatos("160,591,114,229,230,270,128,1657,624,1503");
        assertEquals(572.03, o.getStandardDeviation(), 0.05);
    }

    @Test
    public void calcularMediaPrueba2(){
        o.createDatos("15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2");
        assertEquals(60.32, o.getMean(),0.05);
    }

    @Test
    public void calcularDesviacionEstandarPrueba2(){
        o.createDatos("15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2");
        assertEquals(62.26, o.getStandardDeviation(), 0.05);
    }
}
