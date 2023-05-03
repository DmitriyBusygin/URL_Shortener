package links;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoConnect {
    public static void main(String[] args) {
        MongoClientOptions options = MongoClientOptions.builder().connectionsPerHost(100).build();
        MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017), options);
        MongoDatabase db = mongoClient.getDatabase("links");
        MongoCollection<Document> groups = db.getCollection("groups");
        for (Document group : groups.find()) {
            System.out.println(group);
        }
    }
}
