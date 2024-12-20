package wvsdev.freteflexapp.domain;


import org.springframework.stereotype.Component;

@Component
public class StandardShippingCalculator implements ShippingCalculator {

    @Override
    public Double calculate(Double distance, Double weight) {
        return weight * 1.0 + distance * 0.5;
    }
}
