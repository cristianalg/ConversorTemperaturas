package pt.ipg.conversortemperaturas;

public class TemperaturaFahrenheit extends Temperatura {
    //criar um construtor
    public TemperaturaFahrenheit(double valor){
        this.valor = valor;
    }

    /**
     * Devolve a temperatura em graus Fahrenheit
     *
     * @return um número que representa a temperatura em graus fahrenheit
     */
    @Override
    public double getFahrenheit() {
        return valor;
    }

    /**
     * Devolve a temperatura em graus Celsius
     *
     * @return um número que representa a temperatura em graus celsius
     */
    @Override
    public double getCelsius() {
       // T(°C) = (T(°F) - 32) / (9/5)  --> formula para converter fahrenheit para celsius
        return (valor - 32.0) / (9/5);
    }
}
