package canal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rabbitmq.MessageSender;

/**
 * 利用MQ处理canal消息处理
 */
public class CanalMsgMQHandlerImpl implements CanalMsgHandler {

    private static Logger logger = LoggerFactory.getLogger(CanalMsgMQHandlerImpl.class);

    private MessageSender messageSender;

    public CanalMsgMQHandlerImpl(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public boolean handle(CanalMsg canalMsg) {
        return messageSender.sendMessage(canalMsg.getKey(), canalMsg.getMsg());
    }

}
