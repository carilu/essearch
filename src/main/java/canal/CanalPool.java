package canal;

import com.alibaba.otter.canal.client.CanalConnector;
import com.alibaba.otter.canal.client.CanalConnectors;
import com.alibaba.otter.canal.common.utils.AddressUtils;

import java.net.InetSocketAddress;


public class CanalPool {

    public CanalConnector getConnector() {
        // @TODO 基于zookeeper动态获取canal server的地址
        com.alibaba.otter.canal.client.CanalConnector connector = CanalConnectors.newSingleConnector(new InetSocketAddress("172.16.32.29", 11111), "example", "", "");
        return connector;
    }

}
