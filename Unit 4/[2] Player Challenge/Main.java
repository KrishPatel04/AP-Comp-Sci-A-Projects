/*
 * Programmers: Brian Zhou & Krish Patel
 * Date: 10.12.2023
 * Class: AP CS A
 * Teacher: Dr. Savio
 * Period: 5th
 * Purpose: Utilize a Player class to represent users in a video game
*/

/*
You will write the Player class to represent users in a video game. The class will have the variables listed below. Some will be instance variables and some will be static. You must decide which is appropriate:

username - the name a user chooses
level - the numeric skill level of a player
numUsers - the current number of users online
isOnline - true or false whether the player is online
averageLevel - the average level of all the users currently online


You will create all methods that you believe are necessary to complete the class(i.e. constructor(s), getters, setters, toString…). In addition to that you will write the following functions:

levelUp - player gains a level
logOn - if the user is not online they come online. If they are online an error message prints (think about what might need to update. Have a counter with the number of users online and increment as necessary.)
logOff - if the user is online they go offline. If they are offline an error message prints (think about what might need to update)
versus - this allows two players to challenge each other. The player with the higher level wins. The winner gains a level. The loser loses a level. Levels cannot fall below 0. (Use Math.random in this part!)


You should have a separate Driver class (Main.java) where you have a main method and show that you have tested all of these functions.
  */

class Main {
  
  public static void main(String[] args) {
    Player johnDoe = new Player("John Doe", 3);
    Player janeDoe = new Player("Jane Doe", 5);
    Player guest = new Player();

    System.out.println(johnDoe);
    System.out.println(janeDoe);
    System.out.println(guest);
    
    johnDoe.logOff();
    johnDoe.logOff();
    System.out.println("Level sum is: " + Player.getLevelSum());
    
    System.out.println("John Doe's is " + ((johnDoe.getIsOnline()) ? "online" : "offline"));
    System.out.println("The average player level is " + Player.getAverageLevel());
    
    johnDoe.logOn();
    johnDoe.logOn();    
    System.out.println("Level sum is: " + Player.getLevelSum());
    System.out.println("The average player level is " + Player.getAverageLevel());
    
    System.out.println("Jane Doe's current level is " + janeDoe.getLevel());
    System.out.println("John Doe's current level is " + johnDoe.getLevel());
    
    janeDoe.versus(johnDoe);
    System.out.println(janeDoe);
    System.out.println(johnDoe);
    System.out.println("Level sum is: " + Player.getLevelSum());
    System.out.println("The average player level is " + Player.getAverageLevel());
    
    guest.logOff();
    guest.versus(janeDoe);
    guest.logOn();
    guest.versus(janeDoe);
    
    System.out.println(janeDoe);
    System.out.println(guest);
    System.out.println(Player.getNumberOfPlayersOnline());

    johnDoe.setLevel(janeDoe.getLevel());

    System.out.println("Jane Doe's level: " + janeDoe.getLevel() + ", John Doe's level: " + johnDoe.getLevel());
    
    janeDoe.versus(johnDoe);  // this will produce a randomized result because they are of the same level
    System.out.println("Level sum is: " + Player.getLevelSum());
    System.out.println(janeDoe);
    System.out.println(johnDoe);

    guest.setUsername("Yasu Faustin");
    guest.setLevel(100);
    System.out.println(guest);
    
  }
}