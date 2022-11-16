package com.github.kokasumi.design.principles.ocp.alert.positive;

import com.github.kokasumi.design.principles.ocp.alert.AlertRule;
import com.github.kokasumi.design.principles.ocp.alert.Notification;
import com.github.kokasumi.design.principles.ocp.alert.NotificationEmergencyLevel;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/11/16 11:05
 * @description 接口tps超过阈值告警逻辑handler
 * @since v1.0
 */
public class TpsAlertHandler extends AlertHandler{
    public TpsAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    /**
     * 接口tps超过阈值，发送紧急通知
     * @param apiStatInfo
     */
    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long tps = apiStatInfo.getRequestCount()/ apiStatInfo.getDurationOfSeconds();
        if (tps > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }
}
