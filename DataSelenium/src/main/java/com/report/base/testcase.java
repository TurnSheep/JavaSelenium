package com.report.base;

import java.lang.reflect.Method;
import java.util.Comparator;

public class testcase<ascending> {
//    * Method name ascending lexicographic sort order, with {@link Method#toString()} as a tiebreaker
//    */
   public static Comparator<Method> NAME_ASCENDING = new Comparator<Method>() {
       public int compare(Method m1, Method m2) {
           final int comparison = m1.getName().compareTo(m2.getName());
           if (comparison != 0) {
               return comparison;
           }
           return m1.toString().compareTo(m2.toString());
       }
   };

}
