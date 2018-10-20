package pt.ipg.conversortemperaturas;

public abstract class Temperatura {
    protected double valor;

    /**
     * Devolve a temperatura em graus Fahrenheit
     * @return um número que representa a temperatura em graus fahrenheit
     */
    public abstract double getFahrenheit(); //class abstract serve apenas de base para defenir

    /**
     * Devolve a temperatura em graus Celsius
     * @return um número que representa a temperatura em graus celsius
     */
    public abstract double getCelsius();
}
