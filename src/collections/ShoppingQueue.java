package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoppingQueue {

   public Collection<Person> personCollection = new ArrayList<>();
   public Iterator<Person> iterator = personCollection.iterator();


    public void addCustomer(Person person){
        personCollection.add(person);
    }

    public Person serviceCustomer (Person person) {
        if(!iterator.hasNext()){
            throw new RuntimeException("lista jest pusta");
        }else {
           return person;
        }

    }
}
