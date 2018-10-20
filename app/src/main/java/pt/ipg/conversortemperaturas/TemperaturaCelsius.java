package pt.ipg.conversortemperaturas;

public class TemperaturaCelsius extends Temperatura {
    //criar um construtor
    public TemperaturaCelsius(double valor) {
        this.valor = valor;
    }

    /**
     * Devolve a temperatura em graus Fahrenheit
     * @return um número que representa a temperatura em graus fahrenheit
     */
    @Override
    public double getFahrenheit() {
        //T(°F) = T(°C) × 9/5 + 32 --> formula para converter celsius para fahrenheit
        return valor * 9.0/5.0 + 32.0; //todo: corrigir bug
    }

    /**
     * Devolve a temperatura em graus Celsius
     * @return um número que representa a temperatura em graus celsius
     */
    @Override
    public double getCelsius() {
        return valor;
    }
}
