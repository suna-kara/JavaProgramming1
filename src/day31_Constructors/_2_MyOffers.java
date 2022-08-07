package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class _2_MyOffers {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.setInfo("VA","Amazon Inc","SDET",110000.0,true,true,true,true);



    Offer offer2=new Offer();
    offer2.setInfo("CA","Sony Inc","QA",120000.0,true,false,true,false);



    Offer offer3=new Offer();
    offer3.setInfo("FL","Apple Inc","QE",125000.0,true,true,true,true);


        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapitalOne", "SM", 115000.0, false, false, true, true);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank Of America", "BA", 130000.0, true, true, false, true);




        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);


        System.out.println("****************************************");

        Offer[] myOffers={offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer> fullTimeoffers=new ArrayList<>(Arrays.asList(myOffers));

        fullTimeoffers.removeIf(p-> !p.isFullTime ); // removes if the offer is NOT fulltime

        System.out.println(fullTimeoffers.size());


        ArrayList<Offer> localOffers=new ArrayList<>(Arrays.asList(myOffers));

        localOffers.removeIf(p-> !(p.location.equals("VA") || p.location.equals("CA"))); // removes the offer if the offer is not from local area

        System.out.println(localOffers.size());

        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName + " : " +localOffer.salary);
        }




    }






}
