package art.taylerdunn.MyAdSpace;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Sites {
    @Id
    public ObjectId id;
    public String Name;
}
