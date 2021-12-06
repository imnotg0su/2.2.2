package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;

@Controller
public class CarsController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam("count") int count, Model model) {
        model.addAttribute("showMeCars", carService.getAllCars(count));

        return "cars";
    }
}
