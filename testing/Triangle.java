package com.company.object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Triangle {

    public boolean isExist(int firstSide, int secondSide, int thirdSide){
        if(firstSide > 0 && secondSide > 0 && thirdSide > 0){
            if(firstSide <= secondSide + thirdSide && secondSide <= firstSide + thirdSide && thirdSide <= firstSide + secondSide){
                return true;
            }
            else return false;
        }
        else return false;
    }
}
