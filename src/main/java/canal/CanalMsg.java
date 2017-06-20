package canal;

import lombok.Data;

import java.util.Map;

@Data
public class CanalMsg {

    private Map msg;

    private String key;

    CanalMsg(String key, Map msg) {
        this.key = "canal." + key;
        this.msg = msg;
    }

}
