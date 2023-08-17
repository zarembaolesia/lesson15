import org.example.Man;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PeopleTest {
    @Test
    public void womanCanMarryAMan (){
        Woman woman1 = new Woman("Jane", "Doe", 55);
        Man man1 = new Man("John", "Wick", 50);

        Assert.assertEquals(woman1.getFirstName(), "Jane", "The woman`s name wasn`t saved");
        Assert.assertEquals(woman1.getLastName(), "Doe", "The woman`s last name wasn`t saved");
        Assert.assertEquals(woman1.getAge(), 55, "The woman`s age wasn`t saved");
        Assert.assertEquals(woman1.isRetired(), true, "The woman`s retirement status is shown incorrectly");


        Assert.assertEquals(man1.getFirstName(), "John", "The man`s name wasn`t saved");
        Assert.assertEquals(man1.getLastName(), "Wick", "The man`s last name wasn`t saved");
        Assert.assertEquals(man1.getAge(), 50, "The man`s age wasn`t saved");
        Assert.assertEquals(man1.isRetired(), false, "The man`s retirement status is shown incorrectly");
    }
    @Test
    public void womanChangesLastNameAfterMarryingAMan (){
        Woman woman1 = new Woman("Jane", "Doe", 55);
        Man man1 = new Man("John", "Wick", 50);

        woman1.registerPartnership(man1);

        Assert.assertEquals(woman1.getPartner().getFirstName()+woman1.getPartner().getLastName(), "John Wick", "Woman`s partner wasn`t set");
        Assert.assertEquals(man1.getPartner().getFirstName()+man1.getPartner().getLastName(), "Jane Wick", "Man`s partner wasn`t set");
        Assert.assertEquals(woman1.getLastName(), "Wick", "The woman`s last name wasn`t changed after marriage");
        Assert.assertEquals(man1.getLastName(), "Wick", "The man`s last name changed after marriage");
    }

    @Test
    public void ManCanMarryAWoman (){
        Woman woman2 = new Woman("Tess", "Black", 67);
        Man man2 = new Man("Bob", "Keller", 70);

        man2.registerPartnership(woman2);

        Assert.assertEquals(woman2.getPartner().getFirstName()+woman2.getPartner().getLastName(), "Bob Keller", "Woman`s partner wasn`t set");
        Assert.assertEquals(man2.getPartner().getFirstName()+man2.getPartner().getLastName(), "Tess Black", "Man`s partner wasn`t set");
        Assert.assertEquals(woman2.getLastName(), "Keller", "The woman`s last name wasn`t changed after marriage");
        Assert.assertEquals(man2.getLastName(), "Keller", "The man`s last name changed after marriage");
    }
    @Test
    public void ManCanMarryAMan (){
        Man man3 = new Man("Jake", "Brown", 65);
        Man man4 = new Man("Alex", "Johnson", 64);

        man3.registerPartnership(man4);

        Assert.assertEquals(man3.getPartner().getFirstName()+man3.getPartner().getLastName(), "Alex Johnson", "Man`s partner wasn`t set");
        Assert.assertEquals(man4.getPartner().getFirstName()+man4.getPartner().getLastName(), "Jake Brown", "Man`s partner wasn`t set");
        Assert.assertEquals(man3.getLastName(), "Brown", "The man`s last name changed after marriage");
        Assert.assertEquals(man4.getLastName(), "Johnson", "The man`s last name changed after marriage");
    }

    @Test
    public void WomanCanMarryAWoman (){
        Woman woman3 = new Woman("Nancy", "Swan", 61);
        Woman woman4 = new Woman("Anne", "Stellar", 59);

        woman4.registerPartnership(woman3);

        Assert.assertEquals(woman3.getPartner().getFirstName()+woman3.getPartner().getLastName(), "Anne Stellar", "Woman`s partner wasn`t set");
        Assert.assertEquals(woman4.getPartner().getFirstName()+woman4.getPartner().getLastName(), "Nancy"+"Swan", "Woman`s partner wasn`t set");
        Assert.assertEquals(woman3.getLastName(), "Swan", "The woman`s last name changed after marriage");
        Assert.assertEquals(woman4.getLastName(), "Stellar", "The woman`s last name changed after marriage");
    }
    @Test
    public void WomanCanDivorceAMan (){
        Woman woman1 = new Woman("Jane", "Doe", 55);
        Man man1 = new Man("John", "Wick", 50);
        woman1.registerPartnership(man1);

        woman1.deregisterPartnership(true);


        Assert.assertEquals(woman1.getPartner().getFirstName()+woman1.getPartner().getLastName(), null, "Deregistering partnership didn`t work");
        Assert.assertEquals(man1.getPartner().getFirstName()+man1.getPartner().getLastName(), null , "Deregistering partnership didn`t work");
        Assert.assertEquals(woman1.getLastName(), "Doe", "The woman`s last name didn`t return after divorce");
        Assert.assertEquals(man1.getLastName(), "Wick", "The man`s last name changed after divorce");
    }

    @Test
    public void WomanCanDivorceAWoman (){
        Woman woman3 = new Woman("Nancy", "Swan", 61);
        Woman woman4 = new Woman("Anne", "Stellar", 59);
        woman4.registerPartnership(woman3);

        woman3.deregisterPartnership(true);


        Assert.assertEquals(woman3.getPartner().getFirstName()+woman3.getPartner().getLastName(), null, "Deregistering partnership didn`t work");
        Assert.assertEquals(woman4.getPartner().getFirstName()+woman4.getPartner().getLastName(), null , "Deregistering partnership didn`t work");
        Assert.assertEquals(woman3.getLastName(), "Swan", "The woman`s last name changed after divorce");
        Assert.assertEquals(woman4.getLastName(), "Stellar", "The woman`s last name changed after divorce");
    }

    @Test
    public void ManCanDivorceAWoman (){
        Woman woman2 = new Woman("Tess", "Black", 67);
        Man man2 = new Man("Bob", "Keller", 70);
        man2.registerPartnership(woman2);

        man2.deregisterPartnership(true);


        Assert.assertEquals(woman2.getPartner().getFirstName()+woman2.getPartner().getLastName(), null, "Deregistering partnership didn`t work");
        Assert.assertEquals(man2.getPartner().getFirstName()+man2.getPartner().getLastName(), null , "Deregistering partnership didn`t work");
        Assert.assertEquals(woman2.getLastName(), "Black", "The woman`s last name didn`t return after divorce");
        Assert.assertEquals(man2.getLastName(), "Keller", "The man`s last name changed after divorce");
    }

    @Test
    public void ManCanDivorceAMan (){
        Man man3 = new Man("Jake", "Brown", 65);
        Man man4 = new Man("Alex", "Johnson", 64);
        man3.registerPartnership(man4);

        man4.deregisterPartnership(true);

        Assert.assertEquals(man3.getPartner().getFirstName()+man3.getPartner().getLastName(), null, "Deregistering partnership didn`t work");
        Assert.assertEquals(man4.getPartner().getFirstName()+man4.getPartner().getLastName(), null , "Deregistering partnership didn`t work");
        Assert.assertEquals(man3.getLastName(), "Brown", "The man`s last name changed after divorce");
        Assert.assertEquals(man4.getLastName(), "Johnson", "The man`s last name changed after divorce");
    }
}