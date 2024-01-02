class Player {
  /* 
  Instance variables: username, level, isOnline 

  The following are non-static variable because they are specific to each object. Therefore, they are non-static and are not shared among all objects.

  The following are also private variables, meaning that the user must access them through the methods of the class. If they were public, then they could be accessed by other classes.
  */
  private String username;
  private int level;
  private boolean isOnline = true;

  /* 
  Class variables: numUsers, levelSum, averageLevel 

  The following are static variable because they are used to refer to the common property of all objects. Therefore, they are static and are shared among all objects.

  The following are again private variables and must be accessed through the methods of the class.
  */
  private static int numUsers = 0;
  private static long levelSum = 0;
  private static double averageLevel = 0;

  /*
  Method: addOnlineUser()

  The addOnlineUser() method is used to increment the number of online users by 1 and updated the levelSum and averageLevel static class variables.
  */
  private static void addOnlineUser(int level) {
    Player.numUsers++;
    Player.levelSum += level;
    Player.averageLevel = (double) Player.levelSum / Player.numUsers;
  }

  /*
  Method: removeOnlineUser()
  Parameter: level (int)

  The removeOnlineUser(int level) method is used to decrement the number of online users by 1 and updated the levelSum and averageLevel static class variables.
  */
  private static void removeOnlineUser(int level) {
    Player.numUsers--;
    Player.levelSum -= level;
    Player.averageLevel = (double) Player.levelSum / Player.numUsers;
  }

  /*
  Constructor: Player()

  The Player() constructor is used to serve as the deafult constructor for the Player class. It initializes the username and level to "Guess" and 0, respectively.

  Additionally, addOnlineUser(int level) method is called from the Player class in order to update the users in the game.
  */
  public Player() {
    this.username = "Guest";
    this.level = 0;
    System.out.println("New guest account created");

    Player.addOnlineUser(this.level);
  }

  /*
  Overloaded constructor: Player()
  Parameter: username (String), level (int)

  The Player() constructor is used to serve as the overloaded constructor for the Player class. It initializes the username and level to the username parameter and level parameter, respectively.

  Again, addOnlineUser(int level) method is called from the Player class in order to update the users in the game.
  */
  public Player(String username, int level) {
    this.username = username;
    this.level = level;
    System.out.println("User " + username + " has created a level " + level + " account.");
    
    Player.addOnlineUser(this.level);
  }
  
  public void levelUp() {
    if (this.level == Integer.MAX_VALUE) {
      System.out.println(this.username + " has reached the maximum level.");
      return;
    }
    this.level++;
    System.out.println(this.username + " has leveled up");

    Player.levelSum++;
    Player.averageLevel = (double) Player.levelSum / Player.numUsers;

  }

  public void levelDown() {
    if (this.level == 0) { 
      return; 
    }
    this.level--;
    System.out.println(this.username + "has leveled down");
    
    Player.levelSum--;
    Player.averageLevel = (double) Player.levelSum / Player.numUsers;
  }

  public void logOn() {
    if (this.isOnline) {
      System.out.printf("ERROR %s tried logging in while already logged in\n", this.username);
      return;
    }
    this.isOnline = true;
    System.out.println(this.username + " has logged on.");
  
    Player.addOnlineUser(this.level);
  }

  public void logOff() {
    if (!this.isOnline) {
      System.out.printf("ERROR %s tried logging off while already logged out\n", this.username);
      return;
    }
    this.isOnline = false;
    System.out.println(this.username + " has logged off.");
    
    Player.removeOnlineUser(this.level);
  }

  public void versus(Player other) {
    if (!(this.isOnline && other.isOnline)) {
      System.out.printf("ERROR %s attempted to play against %s without both being online\n", this.username, other.username);
      return;
    }

    Player winner, loser;
    
    if (this.level > other.level) {
      winner = this;
      loser = other;
    } else if (this.level < other.level) {
      winner = other;
      loser = this;
    } else {
      if (Math.random() > 0.5) {
        winner = this;
        loser = other;
      } else {
        winner = other;
        loser = this;
      }
    }
    
    winner.levelUp();
    loser.levelDown();
    System.out.println(winner.username + " has won the game.");
  }

  @Override
  public String toString() {
    return String.format("%s is level %s and %s online. There are currently %s players online and their average level is %s.", this.username, this.level, (this.isOnline) ? "is" : "is not", Player.numUsers, Player.averageLevel);
  }
  
  // getters
  public static double getAverageLevel() {
    return Player.averageLevel;
  }

  public static int getNumberOfPlayersOnline() {
    return Player.numUsers;
  }

  public static long getLevelSum() {
    return Player.levelSum;
  }

  public boolean getIsOnline() {
    return this.isOnline;
  }

  public int getLevel() {
    return this.level;
  }

  public String getUsername() {
    return this.username;
  }

  // setters
  public void setUsername(String username) {
    this.username = username;
  }
    
  public void setIsOnline(boolean isOnline) {
    this.isOnline = isOnline;
  }

  public void setLevel(int level) {
    if (level < 0) {
      System.out.println("ERROR: Level cannot be negative");
      return;
    }
    Player.levelSum -= this.level;
    this.level = level;
    Player.levelSum += level;
    Player.averageLevel = (double) Player.levelSum/Player.numUsers;
  }
}