package wvsdev.freteflexapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wvsdev.freteflexapp.dto.ShippingResponse;
import wvsdev.freteflexapp.service.ShippingService;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

    private final ShippingService shippingService;

    public ShippingController(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    @GetMapping("/calculate")
    public ResponseEntity<ShippingResponse> calculate(@RequestParam("type") String shippingTtype,
                                                      @RequestParam("distance") Double distance,
                                                      @RequestParam("weight") Double weight) {

        var cost  = shippingService.calculate(shippingTtype, distance, weight);
        return ResponseEntity.ok(new ShippingResponse(cost));
    }
}
