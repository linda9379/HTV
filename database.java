//import

public class database {
  public static void main (String argsp[]){

    MongoClientURI uri = new MongoClientURI(
        "mongodb+srv://<rosha>:<hackthevalley2020>@locations-ytlfp.gcp.mongodb.net/test?retryWrites=true&w=majority");
    MongoClient mongoClient = new MongoClient(uri);
    MongoDatabase database = mongoClient.getDatabase("test");

  }
}
