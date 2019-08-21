import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.junit.Test;

/**
 * Created By Kenson on 2019/8/17.
 */


public class MongoDBConnectTest {
    @Test
    public void MongoTest(){

        //创建MongoDb客户端连接
//        MongoClient mongoClient = new MongoClient("localhost", 27017);
        //采用MongoDB字符串链接
        MongoClientURI mongoClientURI = new MongoClientURI("mongodb://root:123@localhost:27017");
        MongoClient mongoClient = new MongoClient(mongoClientURI);
        //链接数据库
        MongoDatabase database = mongoClient.getDatabase("xc-cms");
        //链接集合
        MongoCollection<Document> cms_config = database.getCollection("cms_config");
        //获得第一个文档
        Document first = cms_config.find().first();
        String s = first.toJson();
        System.out.println(s);


    }




}
