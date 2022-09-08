class Main {
  public static void main(String[] args) {
    
    String country1 = "United States of America";
    String country2 = "Philippines";
    String country3 = "China";

    int population1 = 329064917;
    int population2 = 108116615;
    int population3 = 1425887337;

    String FamousDish1 = "Adobo";
    String FamousDish2 = "Apple Pie";
    String FamousDish3 = "Peking Duck";
  
    System.out.println("\nCountry 1");
    System.out.println("Name: " + country1);
    System.out.println("Population: " + population1);
    System.out.println("Famous Dish: " + FamousDish1);

    System.out.println("\nCountry 2");
    System.out.println("Name: " + country2);
    System.out.println("Population: " + population2);
    System.out.println("Famous Dish: " + FamousDish2);

    System.out.println("\nCountry 3");
    System.out.println("Name: " + country3);
    System.out.println("Population: " + population3);
    System.out.println("Famous Dish: " + FamousDish3);

    System.out.println("\nTotal sum of populations: " + (population1 +   
    population2 + population3));

    if(population1 > population2 && population1 > population3) {
       System.out.println("\nLargest Population is: " + country1 + " with " + population1);
    }
    else if(population2 > population3 && population2 > population1) {
      System.out.println("\nLargest Population is: " + country2 + "     with " + population2);
    }
    else {
      System.out.println("\nLargest Population is: " + country3 + "    with " + population3);
    }


    if(FamousDish1 == FamousDish2 && FamousDish2 == FamousDish3){
      System.out.println("\nThe countries have the same Famous Dish");
    }
    else {
      System.out.println("\nThe countries don't have the same Famous Dish");
    }
    }
  }
