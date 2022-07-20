package com.java.Demo;

import java.util.Comparator;

public class MyComparator implements Comparator {

//customized logic
    @Override
    public int compare(Object ob1, Object ob2) {
        //we have to assign local variable object to integer first
        Integer I1= (Integer) ob1;
        Integer I2=(Integer) ob2;
        if (I1 < I2)
            return +1;
        else if (I1 > I2)
            return -1;
        else
        return 0;
    }
}
