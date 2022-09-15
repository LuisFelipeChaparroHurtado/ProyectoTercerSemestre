/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.AbstractList;
import java.util.Iterator;

/**
 *
 * @author Felipe Chaparro
 * @param <T>
 */
public abstract class AbstractFacade<T> {
    //Attributes

    protected AbstractList<T> data;

    /**
     * Find all object
     *
     * @return
     * @throws java.lang.Exception
     */
    public AbstractList<T> findAll() throws Exception {
        return data;
    }

    /**
     * Find one object by id
     *
     * @param id
     * @return
     * @throws java.lang.Exception
     */
    public T findOne(int id)throws Exception{
        Iterator it = data.iterator();

        while (it.hasNext()) {
            T temp= (T) it.next();
            if (temp.hashCode() == id) {
                return temp;
            }
        }
        return null;
    }
    
    /**
     * Persist an object into data structure
     * @param object
     * @throws java.lang.Exception
     */
    public void create(T object) throws Exception{
        data.add(object);
    }
    
    /**
     * Updates an object on data structure
     * @param id
     * @param object
     * @throws java.lang.Exception
     */
    public void merge(int id,T object) throws Exception{
        if(findOne(id) != null){
            T oldOne= findOne(id);
            
            //Remove from data structure
            data.remove(oldOne);
            
            //Add new one on data structure
            data.add(object);
        }
    }
    
    /**
     * Delete object from data structure
     * @param id
     * @throws java.lang.Exception
     */
    public void delete(int id) throws Exception{
        if(findOne(id) != null){
            T oldOne= findOne(id);
            
        //Remove old one from data structure
            data.remove(oldOne);
        }
    }
}
