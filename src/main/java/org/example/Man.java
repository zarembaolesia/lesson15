package org.example;
import org.example.base.Person;

public class Man extends Person {
    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public boolean isRetired() {
        if (this.getAge() >= 65) {
            return true;
        }
        return false;
    }

    public void registerPartnership(Person partner) {
        this.setPartner(partner);
        partner.setPartner(this);
        if (partner instanceof Woman) {
            Woman wife = (Woman) partner;
            wife.setPrevLastName(wife.getLastName());
            wife.setLastName(this.getLastName());
        }
    }

    public void deregisterPartnership(boolean revertLastName) {
        if (revertLastName) {
            Person partner = this.getPartner();
            if (partner != null) {
                partner.setPartner(null);
                if (partner instanceof Woman) {
                    Woman wife = (Woman) partner;
                    wife.setLastName(wife.getPrevLastName());
                }
            }
        }
        this.setPartner(null);
    }

}
