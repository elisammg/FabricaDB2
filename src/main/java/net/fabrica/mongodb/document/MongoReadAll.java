package net.fabrica.mongodb.document;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

import java.util.ArrayList;

/**
 * MongoDB Read Documents Example
 * @author Ramesh Fadatare
 *
 */

public class MongoReadAll {

    public static void main(String[] args) {

        try (var mongoClient = MongoClients.create("mongodb://34.82.29.255:27017")) {

            var database = mongoClient.getDatabase("fabrica");

            MongoCollection < Document > collection = database.getCollection("clientes");

            try (MongoCursor < Document > cur = collection.find().iterator()) {

                while (cur.hasNext()) {

                    var doc = cur.next();
                    var users = new ArrayList < > (doc.values());

                    System.out.printf("%s: %s%n", users.get(1), users.get(2));
                }
            }
        }
    }
}