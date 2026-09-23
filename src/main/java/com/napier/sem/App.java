package com.napier.sem;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class App
{
    public static void main(String[] args)
    {
        // Get MongoDB host from environment variable.
        // GitHub Actions/Docker provides MONGO_IP.
        // If running from IntelliJ, use localhost.
        String mongoHost = System.getenv("MONGO_IP");

        if (mongoHost == null || mongoHost.isEmpty()) {
            mongoHost = "localhost";
        }

        System.out.println("Connecting to MongoDB at: " + mongoHost + ":27017");

        MongoClient mongoClient = new MongoClient(mongoHost, 27017);

        MongoDatabase database = mongoClient.getDatabase("mydb");
        MongoCollection<Document> collection = database.getCollection("test");

        Document doc = new Document("name", "Kevin Sim")
                .append("class", "DevOps")
                .append("year", "2024")
                .append("result", new Document("CW", 95).append("EX", 85));

        collection.insertOne(doc);

        Document myDoc = collection.find().first();
        System.out.println(myDoc.toJson());

        mongoClient.close();
    }
}