class Main {
  public static void main(String[] args) {
    
    boolean isSunny = false;
    boolean isRaining = false;
    int temp =0;

    // && and complex boolean - Both expression have to evaluate to true to overall be true
    //if first expression is false it will short circuit and not even evaluate the second expression.
    
    //isSunny = true;
    temp = 65;

    if(isSunny && 5/0>80){
      System.out.println("Its a nice day");
    }

    // || or complex boolean.  Either of the expressions have to tre to make the overall true
    // if the fist expression is true then it will short circuit and not even evalute the second.

   isRaining = true;
    if(isRaining || 5/0 >0 && !isSunny){
      System.out.println("dont play in the rain");
    }

   System.out.println("End of program");


     //60 < temp < 80

     if(60 < temp && temp < 80)
     System.out.println();
  }
}