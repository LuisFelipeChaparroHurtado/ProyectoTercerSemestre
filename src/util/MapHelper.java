/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

public class MapHelper {
    
    
    private final int key;
    private final String label;

    public MapHelper(Object object) {
        this.key = object.hashCode();
        this.label = object.toString();
    }

    public int getKey() {
        return key;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }
    
    
    
}
