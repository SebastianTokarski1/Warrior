package collections;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

 public class PhoneBook {


   public Map<Integer , Person> map = new HashMap<>();



     public void addPerson(int number, Person person){
        map.put(number , person);
    }


    public Person searchPerson (int number){
        return map.get(number);
    }

    public Set keySet (){
       return map.keySet();
    }

    public void removePerson (int number){
        map.remove(number);
    }

}
