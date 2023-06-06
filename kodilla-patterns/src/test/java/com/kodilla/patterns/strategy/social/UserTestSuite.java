package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User henry = new Millenials("Henry Dodge");
        User john = new YGeneration("John Dwayne");
        User pablo = new ZGeneration("Pablo Dagrasso");

        //When
        String henrySocialPublisher = henry.sharePost();
        System.out.println("Henry posts on: " + henrySocialPublisher);
        String johnSocialPublisher = john.sharePost();
        System.out.println("John posts on: " + johnSocialPublisher);
        String pabloSocialPublisher = pablo.sharePost();
        System.out.println("Pablo posts on: " + pabloSocialPublisher);

        //Then
        Assertions.assertEquals("Twitter Publisher", henrySocialPublisher);
        Assertions.assertEquals("Facebook Publisher", johnSocialPublisher);
        Assertions.assertEquals("Snapchat Publisher", pabloSocialPublisher);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User gabe = new Millenials("Gabe Oldwell");

        //When
        String gabesSocialPublisher = gabe.sharePost();
        System.out.println("Gabe's default social publisher is " + gabesSocialPublisher);
        gabe.setSocialPublisher(new FacebookPublisher());
        gabesSocialPublisher = gabe.sharePost();
        System.out.println("Gabe's new social publisher is " + gabesSocialPublisher);

        //Then
        Assertions.assertEquals("Facebook Publisher", gabesSocialPublisher);


    }
}
