package ru.appline.compass.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.appline.compass.logic.Model;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {
    private static final Model model = Model.getInstance();

    @PostMapping(value = "/getSide", consumes = "application/json", produces = "application/json")
    public Map<String, String> getSide(@RequestBody Map<String, Double> request){
        double degree = (double) request.get("degree");

        String side = model.getSide(degree);

        Map<String, String> result = new HashMap<>();
        result.put("side", side);
        return result;
    }
}
