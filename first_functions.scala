object first_functions extends {

  def convertCToF(x:Double):Double=x*1.8+32; 
  

  def sphereVolume(x:Double):Double=22*x*x*x*4/(3*7);
  

  def wholeSaleCost(x:Int):Double={ 
    if(x<50){
      24.95*(60/100)+3
    } 
    else{
      24.95*(60/100)+3+(x-50)*0.75;
    }
                                        
  }


  def main(args: Array[String]): Unit = {

    println("Fahrenheit : " , convertCToF(35));

    println("Volume : " , sphereVolume(5));

    println("Whole sale cost : " , wholeSaleCost(60));

  }

}