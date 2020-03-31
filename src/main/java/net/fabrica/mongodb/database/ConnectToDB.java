package net.fabrica.mongodb.database;

import com.mongodb.client.MongoClients;

/**
 * Java MongoDB Connection Example
 * @author Ramesh Fadatare
 *
 */
public class ConnectToDB {
    public static void main(String args[]) {

        try (var mongoClient = MongoClients.create("mongodb://34.82.29.255:27017")) {

            var database = mongoClient.getDatabase("fabrica");

            System.out.println("database name -> " + database.getName());

            for (String name: database.listCollectionNames()) {

                System.out.println(name);
            }
        }
    }
}