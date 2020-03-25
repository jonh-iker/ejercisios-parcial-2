/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JTextField;

/**
 *
 * @author jonhy
 */
public class Date {
    private Integer dia;
    private Integer mes;
    private Integer anio;
    
    public Date(Integer d,Integer m, Integer a) throws anioinvalido, mesinvalido, diainvalido, dianocorrespondiente{
        this.dia=d;
        this.mes=m;
        this.anio=a;
        valorar();
    }

    
    public void valorar() throws anioinvalido,mesinvalido,diainvalido,dianocorrespondiente{
    if((this.anio<1900)||(this.anio>2100)){
        throw new anioinvalido();
    }
    if((this.mes<1)||(this.mes>12)){
    throw new mesinvalido();
    }
    if((this.dia<1)||(this.dia>31)){
    throw new diainvalido();
    }
    if(this.dia>getdia()){
    throw new dianocorrespondiente();
    }
    }
    public Integer getdia(){
        Integer d =1;
        switch(this.mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                d=31;
                break;
                
            case 4:
            case 6:
            case 9:
            case 11:
                d=30;
                break;
            case 2: if(anio%4==0){
                d=29;
            }
            d=28;
            break;
        }
        return d;
    }
}
