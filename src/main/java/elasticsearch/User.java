package elasticsearch;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;


@Data
@Document(indexName="supplychain", type="user", refreshInterval="-1")
public class User implements Serializable {

    private static final long serialVersionUID = -2312110729335920029L;

    @Id
    private Integer id;

    private String name;

}
