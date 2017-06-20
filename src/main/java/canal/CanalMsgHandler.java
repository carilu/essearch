package canal;

import com.alibaba.fastjson.JSON;

public interface CanalMsgHandler {

    boolean handle(CanalMsg canalMsg);

}
