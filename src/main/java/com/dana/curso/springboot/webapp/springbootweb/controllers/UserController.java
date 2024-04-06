package com.dana.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class UserController {
@GetMapping("/details")
public String details(Model model) {
  model.addAttribute("title", " web application con sping boot");
  model.addAttribute("name", "Dana Paola");
  model.addAttribute("lastname", "Angellotti");
  return "details";
}

}
