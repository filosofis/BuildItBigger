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
                    "Dracula takes 2 used tampons and puts them in the cup\n" +
                    "Bartender: What are you doing!?\n" +
                    "Dracula: Im making tea",

            "Dante Nero\n" +
                    "----------------------------------------------\n" +
                    "guy runs into a hospital:\n" +
                    "guy: I just heard that my wife was in a horrible accident\n" +
                    "doctor: I got some bad news. She was in the car, the car almost\n" +
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
                    "woman: Im sorry sir, you cannot do that Im going to get the manager.\n" +
                    "\tthe manager comes out and says\n" +
                    "manager: Whats going on here?\n" +
                    "guy: I just won a 100 million dollar lottery, and I wanna open a fucking checking account\n" +
                    "manager: and this cunt is giving you trouble!?",

            "Jeffery Gurrian\n" +
                    "----------------------------------------------\n" +
                    "An old jewish man marries a young beautiful woman and they are having\n" +
                    "sex for months, but she doesent have one orgasm! not one fucking orgasm!\n" +
                    "and its written into the jewish religion that a wife must cum at least once\n" +
                    "during the marriage. So they go to the rabbi. The rabbi says:\n" +
                    "rabbi: here's what you do, the next time your having sex with your wife,\n" +
                    "get a young handsome man, " +
                    "have him stand at the foot of the bed, and have him wave a towel while you are having sex.\n" +
                    "I guarantee your wife's going to have an orgasm. He goes home, he gets a young handsome man,\n" +
                    "he is having sex with his wife, the young handsome man is waving the towel, nothing happens!\n" +
                    "no orgasm at all\n" +
                    "he goes back to the rabbi, he says: \n" +
                    "Old man: rabbi I did what you told me, and my wife dident have a orgasm!\n" +
                    "rabbi: heres what you do, switch partners, You have the young handsome man have sex with your wife\n" +
                    "and you wave the towel. So the guy goes home, he has the young handsome man have sex with his wife,\n" +
                    "the old mans at the foot of the bed waving the towel, the guy is screwing his wife and she is having\n" +
                    "one orgasm after the next. And the old man looks at him and smiles and says:\n" +
                    "Old man: You see schmuck, thats how you wave a towel!",

            "Ron Bennington\n" +
                    "----------------------------------------------\n" +
                    "Wife says to her husband\n" +
                    "Wife: You are gonna have to get a haircut, take our 7year old with you.\n" +
                    "Man: Well Im not going to the beauty parlor.\n" +
                    "Wife: She is 7! just take her to the barber shop.\n" +
                    "So they go to the barber shop, she is having fun with all the guys,\n" +
                    "they are geting their hair cut. She is having a little snack , she is\n" +
                    "eating a twinky at the time meenwhile the barber is cutting her hair and he looks down\n" +
                    "and says\n" +
                    "Barber: Aw hunny you got a little hair on your twinky.\n" +
                    "Girl: I think im geting tits to!",

            "Gail Bennington\n" +
                    "----------------------------------------------\n" +
                    "Woman walks into a gynecologist office.\n" +
                    "She goes in puts her feet in the stirrups,\n" +
                    "doctor comes in spreads her feet apart and says\n" +
                    "doctor: Oh my god that is the biggest vagina I have ever seen,\n" +
                    "\tbiggest vagina I have ever seen, biggest vagina I have ever seen.\n" +
                    "Woman: Oh my god that is so rude, its incredibly unprofesional,\n" +
                    "\tand did you have to emphasize it so much?\n" +
                    "doctor: I am sorry, you are right, it was unprofessional, I have no excuse.\n" +
                    "\tBut I will say in my defence I only said it Once, Once, Once.",

            "Aaron Berg\n" +
                    "----------------------------------------------\n" +
                    "A priest calls the emergency room and says\n" +
                    "Priest: Send someone quick, one of the alter boys just swallowed a condom.\n" +
                    "Calls back 5 minutes later\n" +
                    "Priest: Dont worry, I found another one.",

            "Adam Ferrara\n" +
                    "\n" +
                    "Do you know why Hitler dident drink?\n" +
                    "-Meeeeean drunk"
    };
    public String getJoke() {
        return jokes[rnd.nextInt(10)];
    }
}
