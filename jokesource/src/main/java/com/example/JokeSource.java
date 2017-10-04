package com.example;

import java.util.Random;

public class JokeSource {
    private Random rnd = new Random();
    private String []jokes = {
            "Ari Shaffir\n" +
                    "-----------------------------------------------\n" +
                    "Whats the worst part of being a child molester?\n" +
                    "-Geting the blood out of your clown costume\n",

            "Ari Shaffir\n" +
                    "-----------------------------------------------\n" +
                    "Why did the monkey fall out of the tree?\n" +
                    "-Because it was dead",

            "Dante Nero\n" +
                    "----------------------------------------------\n" +
                    "Dracula walks into a bar\n" +
                    "Bartender: What do you want?\n" +
                    "Dracula: give me a mug with some hot water\n" +
                    "Dracula takes 2 sued tampons and puts them in the cup\n" +
                    "Bartender: What are you doing!?\n" +
                    "Dracula: Im making tea",

            "Dante Nero\n" +
                    "----------------------------------------------\n" +
                    "guy runs into a hospital:\n" +
                    "guy-I just heard that my wife was in a horrible accident\n" +
                    "doctor-I got some bad news. She was in the car, the car allmost\n" +
                    "crushed her to death, her face hit the dashboard, she crushed the\n" +
                    "side of her face, then the car caught on fire, 60% of her body was\n" +
                    "burnt up. She will no longer be able to walk, she cant hold her \n" +
                    "bowls, your gonna have to clean her and feed her for the rest of\n" +
                    "your life.\n" +
                    " the guy grabs his face and falls to the ground crying screaming\n" +
                    "guy: What am I going to do!\n" +
                    "doctor: Ah im just joking with you, shes dead!",

            "Jeffery Gurrian\n" +
                    "----------------------------------------------\n" +
                    "A guy walks into a bank and says\n" +
                    "guy: I want to open a fucking checking account!\n" +
                    "woman: Im sorry sir, you cant use that kind of language in here\n" +
                    "guy: I don't give a fuck I just wanna open a motherfucking checking account!\n" +
                    "woman: Im sorry sir, you cannot do that Im going to get the manager\n" +
                    " the manager comes out and says\n" +
                    "manager: Whats going on here?\n" +
                    "guy: I just won a 100 million dollar lottery, and I wanna open a fucking checking account\n" +
                    "manager: and this cunt is giving you trouble!?",

            "Jeffery Gurrian\n" +
                    "----------------------------------------------\n" +
                    "An old jewish man marries a young beautiful woman and they are having\n" +
                    "sex for months but she doesent have one orgasm! not one fucking orgasm!\n" +
                    "and its written into the jewish religion that a wife must cum at least once\n" +
                    "during the mariage. So the go to the rabbi. The rabbi says:\n" +
                    "rabbi: here's what you do, the next time your having sex with your wife,\n" +
                    "get a young handsome man"
    };
    public String getJoke() {
        return jokes[rnd.nextInt(6)];
    }
}
