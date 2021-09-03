package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;
import javax.servlet.http.HttpServletRequest;



@Controller
public class CarController {

    @Autowired
    private CarServiceImpl carService;

    @GetMapping(value = "/cars")
    public String carController(@RequestParam (value = "count",required = false) Integer count, Model model) {

        if (count == null) {
            model.addAttribute("cars", carService.getCars());
        } else {
            model.addAttribute("cars", carService.getCarsCount(count));
        }

        return "CarsTable";
    }


}
