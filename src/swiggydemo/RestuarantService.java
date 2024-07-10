package swiggydemo;

import java.util.function.Supplier;

public class RestuarantService {

 Supplier<Restuarant> findRestuarant(Swiggy swiggy,String restuarantName){
     return ()->{
         for(Restuarant restuarant:swiggy.getRestuarants()){
             if(restuarant.getName().equalsIgnoreCase(restuarantName)){
                 return restuarant;
             }
         }
         return  null;

     };
 }
}

