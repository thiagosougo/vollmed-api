package med.voll.api.domain.doctor;

import med.voll.api.domain.address.Address;

public record DoctorsDataDetailed(Long id, String name, String email, String crm, String phone, Speciality speciality, Address address) {

    public DoctorsDataDetailed(Doctor doctor){
        this(doctor.getId(), doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getPhone(), doctor.getSpeciality(), doctor.getAddress());
    }
}
