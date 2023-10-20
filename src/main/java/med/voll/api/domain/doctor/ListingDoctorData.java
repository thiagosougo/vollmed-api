package med.voll.api.domain.doctor;

public record ListingDoctorData(Long id, String name, String email, String phone, String crm, Speciality speciality) {

    public ListingDoctorData(Doctor doctor){
        this(doctor.getId(), doctor.getName(), doctor.getEmail(), doctor.getPhone(), doctor.getCrm(), doctor.getSpeciality());
    }
}
