import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.junit.Test;

public class TestMongoDB {

    @Test
    public void testMongoDB(){
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("xc_cms");
        MongoCollection<Document> collection = database.getCollection("cms_site");
        Document myDoc = collection.find().first();
        String json = myDoc.toJson();
        System.out.println(json);
    }
}
