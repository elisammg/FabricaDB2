package net.fabrica.mongodb.document;

import org.bson.Document;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;

/**
 * MongoDB Insert Single Document Example
 * @author Ramesh Fadatare
 *
 */
public class MongoInsertSingleDocument {

    public static void main(String[] args) {
        try (var mongoClient = MongoClients.create("mongodb://34.82.29.255:27017")) {

            var database = mongoClient.getDatabase("fabrica");

            MongoCollection < Document > collection = database.getCollection("users");

            var d1 = new Document("_id", 6);
            d1.append("_firstName", "ABC");
            d1.append("_lastName", "XYZ");

            collection.insertOne(d1);
        }
    }
}