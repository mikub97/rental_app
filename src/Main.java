import model.Rental;
import model.User;
import storage.Storage;

import java.io.*;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Storage storage = deserializeStorage();

        //Place to change something like add new user/rental

        serializeStorage(storage);
    }

    public static void serializeStorage(Storage storage) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream( new FileOutputStream("storage"));
            oos.writeObject(storage);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Storage deserializeStorage(){
        Storage storage = null;
        try {
            FileInputStream fis= new FileInputStream("storage");
            ObjectInputStream ois = new ObjectInputStream(fis);
            storage = (Storage) ois.readObject();
        } catch (EOFException e){

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return storage;
    }

    // method for initialization of all objects  (not used anymore)
    public static void initStorage(Storage storage){
        User u = new User("miki","password","Michał","Jaki","mail@mail.com",false);
        storage.users.add(u);
        User u1 = new User("wiki","password","Wiktoria","Jaka","mail@mail.com",false);
        storage.users.add(u1);

        Rental r = new Rental(u, LocalDateTime.now(),"table",1);
        storage.rentals.add(r);

        Rental r1 = new Rental(u1, LocalDateTime.now(),"chair",2);
        storage.rentals.add(r1);

        storage.stock.put("chair",10L);
        storage.stock.put("table",10L);
    }

}
