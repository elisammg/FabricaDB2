package net.fabrica.mongodb.document;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

/**
 * MongoDB Delete Documents Example
 * @author Ramesh Fadatare
 *
 */

public class MongoDeleteDocument {

    public static void main(String[] args) {
        // Creating a Mongo client
        try (var mongoClient = MongoClients.create("mongodb://34.82.29.255:27017")) {

            // Accessing the database
            MongoDatabase database = mongoClient.getDatabase("fabrica");

            // Retieving a collection
            MongoCollection < Document > collection = database.getCollection("users");

            // Deleting the documents
            collection.deleteOne(Filters.eq("_id", 1));
            System.out.println("Document deleted successfully...");

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