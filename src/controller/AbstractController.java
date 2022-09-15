/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Arrays;
import java.util.Set;

public abstract class AbstractController {
    
    Set<Object> dataList;

     /**
     * Prints every roles in array
     * @param args
     * @return
     */
    
    //Abstract method   
    public abstract boolean save(String [] args);
    
    public String list() {
        return Arrays.toString(dataList.toArray());
    }
    
     /**
     * Adds new role to roles array
     * @param object
     * @throws Exception
     */
    
    protected void _addData(Object object) throws Exception {
        //Creates new array with one more index
        /*Object[] tempArray = new Object[dataList.length + 1];
        //Mograte all data to temp array

        for (int i = 0; i < dataList.length; i++) {
            tempArray[i] = dataList[i];
        }

        //Add new object at last index
        tempArray[tempArray.length - 1] = object;
        // Assign tempArray to roles
        dataList= tempArray;
        */
        dataList.add(object);
    }
    
    protected void _deleteData(Object object) throws Exception{
        dataList.remove(object);
    }
}

