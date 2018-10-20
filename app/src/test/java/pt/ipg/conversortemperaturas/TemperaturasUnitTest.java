package pt.ipg.conversortemperaturas;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TemperaturasUnitTest{
    public static final double TOLERANCIA_DECIMAIS = 0.001; //tolerancia de casa decimais

    @Test
    public void conversaoTemperaturasEstaCorreta()
    {

        //Teste 1 - Celsius para fahrenheit
        Temperatura x = new TemperaturaCelsius(13);
        assertEquals(13.0, x.getCelsius(), TOLERANCIA_DECIMAIS);
        assertEquals(55.4, x.getFahrenheit(), TOLERANCIA_DECIMAIS);
      //x.getCelsius();

        //Teste 2
        x = new TemperaturaFahrenheit(39.2);
        assertEquals(4.0, x.getCelsius(), TOLERANCIA_DECIMAIS);
        assertEquals(39.2, x.getFahrenheit(), TOLERANCIA_DECIMAIS);

        //Teste 3
        x = new TemperaturaCelsius(23.0);
        assertEquals(23.0, x.getCelsius(), TOLERANCIA_DECIMAIS);
        assertEquals(73.4, x.getFahrenheit(), TOLERANCIA_DECIMAIS);

        assertEquals(4, 2 + 2);
    }
}