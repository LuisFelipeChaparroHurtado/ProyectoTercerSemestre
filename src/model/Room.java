/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Room {
    
    private int roomNumber;
    private String room;

    public Room(int roomNumber, String room) {
        this.roomNumber = roomNumber;
        this.room = room;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

   
    @Override
    public String toString() {
        return room;
    }

    

    


    

    

    
}
