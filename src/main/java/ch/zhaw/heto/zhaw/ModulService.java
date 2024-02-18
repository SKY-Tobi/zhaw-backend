package ch.zhaw.heto.zhaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModulService {
    @Autowired
    private ModulRepository modulRepository;

    public Modul saveModul(Modul modul)
    {
        return modulRepository.save(modul);
    }

    public List<Modul> fetchModule()
    {
        return (List<Modul>) modulRepository.findAll();
    }

}
