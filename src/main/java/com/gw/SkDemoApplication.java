package com.gw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SkDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SkDemoApplication.class, args);
  }
}

@Controller
class MainController {

  @GetMapping("/")
  public String welcome(Model model) {
    return "welcome";
  }
}
