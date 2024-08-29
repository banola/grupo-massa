/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pedro
 */
public class Room {
    private double lenght;
    private double height;

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public static RoomBuilder getBuilder(){
        return new RoomBuilder();
    }
    
    public static class RoomBuilder{
        
        private Room room = new Room();
        
        public RoomBuilder withLenght(double lenght){
            room.lenght = lenght;
            return this;
        }
        
        public RoomBuilder withHeight(double height){
            room.height = height;
            return this;
        }
        
        public Room Build(){
            return room;
        }
    }
}
