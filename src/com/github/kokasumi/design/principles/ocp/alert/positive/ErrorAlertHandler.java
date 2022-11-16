package com.github.kokasumi.design.principles.ocp.alert.positive;

import com.github.kokasumi.design.principles.ocp.alert.AlertRule;
import com.github.kokasumi.design.principles.ocp.alert.Notification;
import com.github.kokasumi.design.principles.ocp.alert.NotificationEmergencyLevel;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/11/16 11:07
 * @description 接口出错数超过阈值告警逻辑handler
 * @since v1.0
 */
public class ErrorAlertHandler extends AlertHandler{
    public ErrorAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    /**
     * 接口出错数超过阈值，发送严重通知
     * @param apiStatInfo
     */
    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}
