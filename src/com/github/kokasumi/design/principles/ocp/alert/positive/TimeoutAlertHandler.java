package com.github.kokasumi.design.principles.ocp.alert.positive;

import com.github.kokasumi.design.principles.ocp.alert.AlertRule;
import com.github.kokasumi.design.principles.ocp.alert.Notification;
import com.github.kokasumi.design.principles.ocp.alert.NotificationEmergencyLevel;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/11/16 11:10
 * @description
 * @since v1.0
 */
public class TimeoutAlertHandler extends AlertHandler{
    public TimeoutAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    /**
     * 每秒接口超时请求个数超过设置的最大阈值时，触发告警通知信息。
     * @param apiStatInfo
     */
    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long timeoutTps = apiStatInfo.getTimeoutCount() / apiStatInfo.getDurationOfSeconds();
        if (timeoutTps > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTimeoutTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }
}
