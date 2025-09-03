package abhishekPandey.portfolio.controller;
import java.util.*;
import ch.qos.logback.core.model.Model;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller

public class homeController {
    @GetMapping({"/","","/home"})
    public String showHomePage(org.springframework.ui.Model model){
        model.addAttribute("title", "Home");
        return "master";
    }
    @GetMapping({"/projects"})
    public String showProjectPage(org.springframework.ui.Model model){
        model.addAttribute("title", "Projects");
        return "master";
    }

    @GetMapping({"/resume"})
    public String showResumePage(org.springframework.ui.Model model){
        model.addAttribute("title", "Resume");
        return "master";
    }
    @GetMapping({"/contact"})
    public String showContactPage(org.springframework.ui.Model model){
        model.addAttribute("title", "Contact");
        return "master";
    }



}
