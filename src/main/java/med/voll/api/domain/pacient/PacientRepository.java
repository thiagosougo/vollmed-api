package med.voll.api.domain.pacient;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacientRepository extends JpaRepository<Pacient, Long> {
    Page<Pacient> findAllByActiveTrue(Pageable pagination);
}
