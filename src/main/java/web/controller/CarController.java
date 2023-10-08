package web.controller;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

import web.model.Car;


import java.util.List;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String Cars(@RequestParam(defaultValue="5") int count, Model model){
        CarDao carDao= new CarDao();

        List<Car> qtyCars = carDao.getCar(count);
        model.addAttribute("cars",qtyCars);
        return "cars";

    }



}
