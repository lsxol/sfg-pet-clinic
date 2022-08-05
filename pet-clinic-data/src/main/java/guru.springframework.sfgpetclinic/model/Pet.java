package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {
    private Owner owner;
    @lombok.Setter
    public PetType petType;
    private LocalDate birthDate;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public PetType getPetType() {
        return petType;
    }


    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
