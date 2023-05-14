/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testvehicle;

public final class bus extends Vehicle {
    private int numberOfSeats;
    
    public bus(String color,int year ,int numberOfSeats){
        super(color,year);
        setNumberOfSeats( numberOfSeats);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    
   
@Override
public 
void printVehicleName()
{
 
System.out.println("Bus Class ");
}
 @Override
 
public int numberOfPassengers()
{
 
 
return numberOfSeats;
 
} 
 
public String toString()
{
 
return "the color="+super.getColor()+"the year= "+super.getYear()+"the number Of Seats="+ getNumberOfSeats() ;
 
}


}
