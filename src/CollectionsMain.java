import collections.Person;
import collections.PhoneBook;
import collections.ShoppingQueue;


import java.util.Iterator;
import java.util.Random;

public class CollectionsMain {

    public static void main(String[] args) throws Exception {
        Random random = new Random();
        PhoneBook phoneBook = new PhoneBook();
        ShoppingQueue shoppingQueue = new ShoppingQueue();

        phoneBook.addPerson (1, new Person("Monika" , 36 , "Kobieta"));
        phoneBook.addPerson(2 , new Person("Andrzej" , 30 , "Meszczyzna"));
        phoneBook.addPerson(3 , new Person("Tomasz" , 45, "Meszczyzna"));
        phoneBook.addPerson(4 , new Person("Jedrek" , 22 , "Meszczyzna"));
        phoneBook.addPerson(5 , new Person("Anna" , 55 , "Kobieta"));
        phoneBook.addPerson(6 , new Person("Beata" , 45 , "Kobieta"));
        phoneBook.addPerson(7 , new Person("Karolina" , 31 , "Kobieta"));
        phoneBook.addPerson(8 , new Person("Aniela" , 36 , "Kobieta"));
        phoneBook.removePerson(4);




        for (int i = 1 ; i <= phoneBook.map.size() ; i++ ) {

            System.out.println(phoneBook.searchPerson(i));
        }
        System.out.println(phoneBook.keySet());

        shoppingQueue.addCustomer(new Person("Monika" , 36 , "Kobieta"));
        shoppingQueue.addCustomer(new Person("Monika" , 35 , "Kobieta"));
        shoppingQueue.addCustomer(new Person("Monika" , 34 , "Kobieta"));
        shoppingQueue.addCustomer(new Person("Monika" , 33 , "Kobieta"));
        shoppingQueue.addCustomer(new Person("Monika" , 32 , "Kobieta"));


        for (Person person : shoppingQueue.personCollection){
            shoppingQueue.serviceCustomer(person);
        }

        System.out.println(shoppingQueue.iterator.hasNext());
        System.out.println(shoppingQueue.iterator.next());



    }
}
