/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iocollection;

import java.util.ArrayList;

/**
 *
 * @author Xu
 */
public class Student {
    
    public ArrayList<String>names;
    public ArrayList<Integer>scores;

    
    
    

    public void setName(ArrayList<String> name) {
        this.names = name;
    }

    public void setScores(ArrayList<Integer> scores) {
        this.scores = scores;
    }

    public ArrayList<String> getName() {
        return names;
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }
    
    public void printName(){
        System.out.println(names);
    }
    public void printScore(){
        System.out.println(scores);
    }
}
