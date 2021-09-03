package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarServiceImpl;
import javax.servlet.http.HttpServletRequest;



@Controller
public class CarController {

    @Autowired
    private CarServiceImpl carService;

    @GetMapping(value = "/cars")
    public String carController(HttpServletRequest request, Model model) {

        String count = request.getParameter("count");

        if (count == null) {
            model.addAttribute("cars", carService.getCars());
        } else {
            int i = Integer.parseInt(count.trim());
            model.addAttribute("cars", carService.getCarsCount(i));
        }

        return "CarsTable";
    }


}
