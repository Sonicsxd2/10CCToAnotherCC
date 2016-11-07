/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.Sonicxd2.School.TenCCToAnother;

import java.util.ArrayList;

/**
 *
 * @author Ярослав
 */
public class Action {
    ArrayList<Integer> div=new ArrayList<Integer>();
    ArrayList<Integer> mod=new ArrayList<Integer>();
    int cc;

    public Action(int cc, int firstNumb) {
        this.cc = cc;
        rec(firstNumb);
    }
    
    public int rec(int a){
        if(a<=1) {
            mod.add(a);
            return -1;
        }
        int nextA=a/cc;
        mod.add(a%cc);
        div.add(a/cc);
        return rec(nextA);
    }

    public ArrayList<Integer> getDiv() {
        return div;
    }

    public ArrayList<Integer> getMod() {
        return mod;
    }
    
    
}

