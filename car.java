/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testvehicle;


public class car extends Vehicle {
    private String carSize;
    public car (String color,int year ,String carSize){
        super(color,year);
        setCarSize( carSize);
    }

    public String getCarSize() {
        return carSize;
    }

    public void setCarSize(String carSize) {
        this.carSize = carSize;
    }
    @Override
    public String toString()
{
 
return "the color="+super.getColor()+"the year= "+super.getYear()+"the car size="+getCarSize();
 
}
    
    @Override
public 
void printVehicleName()
{
 
System.out.println("Car Class ");
}
 @Override
 
public int numberOfPassengers()
{
 
if(carSize=="small"){
 
return 4;}
 
else if (carSize=="large") 
 
return 6;
else 
return 0;




}
public void printinfo(){
       System.out.println("the Vehicle size="+getCarSize());
}
}