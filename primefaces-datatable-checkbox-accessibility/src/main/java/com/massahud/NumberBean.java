/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.massahud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 * @author Geraldo Massahud
 */
@ManagedBean
public class NumberBean {

    private static final int SIZE = 5;
    
    private List<Integer> numbers;
    private List<Integer> selected = new ArrayList<>(Arrays.asList(2,4));

    public List<Integer> getNumbers() {
        if (numbers == null) {
            numbers = new ArrayList<>(SIZE);
            for (int i = 0; i < SIZE; i++) {
                numbers.add(i);
            }
        }
        return numbers;
    }

    public List<Integer> getSelected() {
        return selected;
    }

    public void setSelected(List<Integer> selected) {
        this.selected = selected;
    }
    
    

}
