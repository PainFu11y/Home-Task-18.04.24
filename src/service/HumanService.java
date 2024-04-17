package service;
import model.Human;
public class HumanService {
public static Human[] convert(String [] data){
    Human [] humans = new Human[data.length];
    for (int i = 0; i < data.length; i++) {
        humans[i] = new Human(data[i]);
    }
    return humans;
 }

 public static Human maxHuman(Human[] humans){
    Human max = humans[0];
     for (int i = 1; i < humans.length; i++) {
         if(humans[i].getAge() > max.getAge()) max = humans[i];
     }
     return max;
 }

 public static Human[] sortedHumans(Human[] humans){
     for (int i = 0; i < humans.length - 1; i++) {
         for (int j = 0; j < humans.length - i - 1; j++) {
               if(humans[j].getAge() >  humans[j+1].getAge()) {
                   Human temp = humans[j];
                   humans[j] = humans[j+1];
                   humans[j+1] = temp;
               }
         }
     }
     return humans;
 }
}
