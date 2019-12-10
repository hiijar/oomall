package xmu.oomall.controller.vo;

import xmu.oomall.domain.Topic;

import java.util.List;

public class AdminTopicsResponseVo {
    /**
     * 查询到的topics列表
     */
    private List<Topic> topics;

    @Override
    public String toString() {
        return "AdminTopicsResponseVo{" +
                "topics=" + topics +
                '}';
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }
}
