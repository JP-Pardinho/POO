package edu.lista003.qst001;

import java.math.*;

public class ponto {
    double x;
    double y;
    
    double distancia (ponto outroPonto){
        return Math.sqrt(Math.pow((this.x-outroPonto.x),2));
    }

        
}


