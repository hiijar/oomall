package xmu.oomall.controller.vo;


import xmu.oomall.domain.*;

import java.util.List;

/**
 * WX端 GET /topics/{id}的返回值VO
 */
public class TopicVo {

    //专题信息
    private Topic topic;


    @Override
    public String toString(){
        return "TopicVo{" + 
        "topic=" + topic +
        "}";
    }

    public Topic getTopic(){
        return topic;
    }

    public void setTopic(Topic topic){
        this.topic=topic;
    }
}

