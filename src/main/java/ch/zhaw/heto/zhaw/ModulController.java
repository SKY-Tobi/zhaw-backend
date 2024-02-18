package ch.zhaw.heto.zhaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ModulController {
    @Autowired
    private ModulService modulService;

    @GetMapping("/module")
    public List<Modul> fetchModule()
    {
        return modulService.fetchModule();
    }
}
