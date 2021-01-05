public abstract class Converter {
    public abstract double convertFromCelsius(double temp);
}

class FahrenheitConverter extends Converter {
    @Override
    public double convertFromCelsius(double temp) {
        return temp * 9 / 5 + 32;
    }
}

class KelvinConverter extends Converter {
    @Override
    public double convertFromCelsius(double temp) {
        return temp + 273.15;
    }
}