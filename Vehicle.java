/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testvehicle;


public abstract class Vehicle {
    private String color;
    private int year;
    public Vehicle(String color,int year){
        setColor( color);
         setYear( year);
        
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public abstract void printVehicleName() ;
    public abstract int numberOfPassengers() ;
    public final void DISPLAYINFO(){
        System.out.println("the Vehicle color="+ getColor()+"the Vehicle year="+getYear());
        
    }
}
