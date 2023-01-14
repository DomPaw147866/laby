package lab;

public interface Forecast {

    public Float currentTemperature();
    final public class Fake implements Forecast {

        @Override
        public Float currentTemperature() {
            return 20.1f;
        }
    }

}
