    import java.util.Random;
    import java.util.Scanner;
    import java.util.ArrayList;
    
    class Main {
      public static void main(String[] args) {
        System.out.println("Welcome to the State/Capital Quiz. Let's get started!!");
        String[][] SC={{"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"},{"Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Denver", "Hartford", "Dover", "Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines", "Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", "Saint Paul", "Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe", "Albany", "Raleigh", "Bismarck", "Columbus", "Oklahoma City", "Salem", "Harrisburg", "Providence", "Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond", "Olympia", "Charleston", "Madison", "Cheyenne"}};
        String[] cities = SC[1];
        while (1==1) {
        Random random = new Random();
        int x = random.nextInt(SC.length);
        int y = random.nextInt(SC[x].length);
        String userChallenge = SC[0][y];
        String correctAnswer = SC[1][y];
        System.out.println("Here is your state: " + userChallenge + "\nWhat is the capital?\nTo end the quiz and see the capitals for all states, type 'quit'");
        Scanner input = new Scanner(System.in);
        String userAnswer = (input.nextLine());
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
          System.out.println("Correct!");   
        }
        else if (userAnswer.equalsIgnoreCase("quit")) {
          break;}
        else {
          System.out.println("Incorrect :(, \nThe correct capital was: " + correctAnswer + "\nYour answer: " + userAnswer);
        }
        }
        for (int j = 0; j < SC[0].length; j++) {
            for (int i = j + 1; i < SC[0].length; i++) {
                String tempCity;
                String tempState;
                if (SC[1][i].compareTo(SC[1][j]) < 0) {
                    tempCity = SC[1][j];
                    SC[1][j] = SC[1][i];
                    SC[1][i] = tempCity;
                    tempState = SC[0][j];
                    SC[0][j] = SC[0][i];
                    SC[0][i] = tempState;
        System.out.println("Enter as many capitals as you can. Be sure to hit enter between capitals. When finished, type \"go\"");
        boolean endLoop = false;
        Scanner loopScanner = new Scanner(System.in);
        ArrayList<String> userList = new ArrayList<>();
        while (!endLoop) {
            String loopInput = loopScanner.nextLine();
            if (loopInput.equalsIgnoreCase("go")) {
                endLoop = true;
            }
            else {
                userList.add(loopInput);
            }
        }
        System.out.println("You submitted " + userList.size() + " answers.");
        int correctCounter = 0;
        for (String attempt:userList) {
            for (String city:cities) {
                if (attempt.equalsIgnoreCase(city))
                    correctCounter += 1;
            }
          }
          System.out.println("Out of " + userList.size() + " attempts, you got " + correctCounter + " correct.");
      }
    }
  }
}
    }
  