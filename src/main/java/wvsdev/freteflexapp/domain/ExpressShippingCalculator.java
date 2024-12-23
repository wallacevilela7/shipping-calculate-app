package wvsdev.freteflexapp.domain;

import org.springframework.stereotype.Component;

@Component(value = "expressShippingCalculator")
public class ExpressShippingCalculator implements ShippingCalculator {

    @Override
    public Double calculate(Double distance, Double weight) {
        return weight * 1.5 + distance * 0.75;
    }
}
