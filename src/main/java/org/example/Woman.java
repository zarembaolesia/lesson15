package org.example;

import org.example.base.Person;

public class Woman extends Person {

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public boolean isRetired() {
        if (this.getAge() >= 60) {
            return true;
        }
        return false;
    }

    public void registerPartnership (Person partner){
        this.setPartner(partner);
        partner.setPartner(this);
        if(partner instanceof Man){
            Man husband = (Man) partner;
            this.previousLastName = this.getLastName();
            this.setLastName(partner.getLastName());
            husband.setPrevLastName(husband.getLastName());
        };
    }

    public void deregisterPartnership(boolean revertToPrevLastName){
        if(previousLastName == null){
            setPrevLastName(getLastName());
        }
        Person partner = this.getPartner();
        if (revertToPrevLastName){
            this.setLastName(previousLastName);
            if (partner != null) {
                partner.setPartner(null);
                if (partner instanceof Man) {
                    Man husband = (Man) partner;
                    husband.setLastName(husband.getPrevLastName());
                }
            }
        }
        this.setPartner(null);
    }
}
