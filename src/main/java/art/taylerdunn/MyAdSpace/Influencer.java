package art.taylerdunn.MyAdSpace;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.HashMap;


public class Influencer {

    private ObjectId id;
    private String name;

    // Mapping from Site to Links
    private HashMap<Sites, String> links;

    // Mapping from Site to subscriber count
    private HashMap<Sites, Integer> subCount;

    // Users description of audience
    private String demographicDescription;

}
