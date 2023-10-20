package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.domain.pacient.Pacient;
import med.voll.api.domain.pacient.PacientRepository;
import med.voll.api.domain.pacient.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacients")
public class PacientController {

    @Autowired
    private PacientRepository repository;

    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid RegisteredPacientsData data){
        repository.save(new Pacient(data));
    }

    @GetMapping
    public Page<ListingPacientData> toList(@PageableDefault(sort = {"name"}) Pageable pagination){
        return repository.findAllByActiveTrue(pagination).map(ListingPacientData::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid UpdatePacientData data){
        var pacient = repository.getReferenceById(data.id());
        pacient.updateInfo(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id){
        var pacient = repository.getReferenceById(id);
        pacient.exclude();
    }
}
