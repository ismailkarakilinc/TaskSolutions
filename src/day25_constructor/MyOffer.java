package day25_constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {

    public static void main(String[] args) {

        Offer offer1 = new Offer("NewYork","Apple","Java Developer",103000,
                false,false,true,true);
        Offer offer2 = new Offer("Pittsburgh","Microsoft","Designer",113000,
                true,false,true,false);
        Offer offer3 = new Offer("L.A","Cydeo","SDET",93000,
                false,true,false,true);
        Offer offer4 = new Offer("Houston","Samsung","Worker",105000,
                true,false,true,false);
        Offer offer5 = new Offer("Boston","Sony","QA Tester",112000,
                true,true,false,true);
        Offer offer6 = new Offer("Virginia","Philips","Developer",173000,
                true,false,true,true);
        Offer offer7 = new Offer("Orlando","Xiaomi","3D Designer",100000,
                false,false,true,false);

        Offer[] myOffer = {offer1,offer2,offer3,offer4,offer5,offer6,offer7};
        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffer));
        fullTimeOffers.removeIf(p->!p.isFullTime);

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffer));
        localOffers.removeIf(p->!p.location.equalsIgnoreCase("Houston"));

        ArrayList<Offer> offerWithBenefit=new ArrayList<>(Arrays.asList(myOffer));
        offerWithBenefit.removeIf(p->p.hasBenefit==false&&p.hasPTO==false);

        ArrayList<Offer> devOffers = new ArrayList<>(Arrays.asList(myOffer));
        devOffers.removeIf(p->!p.jobTitle.equalsIgnoreCase("Developer"));

        ArrayList<Offer> with100K = new ArrayList<>(Arrays.asList(myOffer));
        with100K.removeIf(p->p.salary<100000);

        System.out.println(fullTimeOffers);
        System.out.println(localOffers);
        System.out.println(offerWithBenefit);


    }
}
