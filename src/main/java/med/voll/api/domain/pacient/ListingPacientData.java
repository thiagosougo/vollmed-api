package med.voll.api.domain.pacient;


public record ListingPacientData(Long id, String name, String email, String phone) {

    public ListingPacientData(Pacient pacient){
        this(pacient.getId(), pacient.getName(), pacient.getEmail(), pacient.getPhone());
    }
}
