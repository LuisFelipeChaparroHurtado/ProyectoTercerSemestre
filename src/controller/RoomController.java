/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Room;

/**
 *
 * @author Felipe Chaparro
 */
public class RoomController extends AbstractFacade<Room>{

    public RoomController() {
        data = new ArrayList<>();
        
        data.add(new Room(1,"101"));
        data.add(new Room(2,"102"));
        data.add(new Room(3,"103"));
        data.add(new Room(4,"104"));
        data.add(new Room(5,"105"));
        data.add(new Room(6,"106"));
    }
    
    
    
}
