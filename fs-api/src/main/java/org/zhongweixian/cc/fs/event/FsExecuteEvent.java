package org.zhongweixian.cc.fs.event;

import com.alibaba.fastjson.annotation.JSONField;
import org.zhongweixian.cc.fs.event.base.FsBaseEvent;

/**
 * Created by caoliang on 2020/11/6
 */
public class FsExecuteEvent extends FsBaseEvent {

    @JSONField(name = "Application-Response")
    private String response;




}
