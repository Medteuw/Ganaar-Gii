package teuw.med.Ganaar.Gi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import teuw.med.Ganaar.Gi.Repositories.GanaarRepository;
import teuw.med.Ganaar.Gi.entities.Ganaar;

import java.util.List;
@Controller
public class GanaarController {
    @Autowired
    private GanaarRepository ganaarRepository;

    @GetMapping("/list")
    public String listGanaar(Model model){
        List<Ganaar> listG = ganaarRepository.findAll();
        model.addAttribute("listegannar",listG);
        listG.getClass().getName();
        return "listGanaar";
    }
    @GetMapping("tousLespouletDisponible")
    public String AllPoulets(Model model){
        
        List<Ganaar> listG = ganaarRepository.findAll();
        model.addAttribute("listegannar",listG);
        return "listOfPoulets";
    }
}
