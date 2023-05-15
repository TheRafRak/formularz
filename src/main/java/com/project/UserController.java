package com.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class UserController {

    @RequestMapping("/formularz")
    public Object hello3(Model model) {
        Osoba osoba = new Osoba("Henryk", "Sienkiewicz", "123-456-789", "henryk@mail.pl");
        model.addAttribute("osoba", osoba);
        return "formularz";
    }

    @PostMapping("/formularz")
    public String addOsoba(@ModelAttribute Osoba osobaFormularz, Model model) {

        model.addAttribute("osobaFormularz", osobaFormularz);
        if(checkNotEmpty(osobaFormularz)) {

            return "poprawnaWalidacja";
        } else
            return "error";
    }

    private boolean checkNotEmpty(Osoba osoba) {
        return (osoba.getImie()!=null
                && osoba.getImie().length()>2)
                &&(osoba.getNazwisko()!=null
                && osoba.getNazwisko().length()>0)
                &&(osoba.getTelefon()!=null)
                && osoba.getTelefon().length() > 2
                &&(osoba.getMail()!=null
                && osoba.getMail().length()>2);
    }
}
