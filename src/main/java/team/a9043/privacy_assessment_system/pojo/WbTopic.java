package team.a9043.privacy_assessment_system.pojo;

public class WbTopic {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_topic.topic_ID
     *
     * @mbg.generated
     */
    private Integer topicId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_topic.uid
     *
     * @mbg.generated
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_topic.topic
     *
     * @mbg.generated
     */
    private Integer topic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_topic.topic_cont
     *
     * @mbg.generated
     */
    private String topicCont;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_topic.topic_ID
     *
     * @return the value of wb_topic.topic_ID
     *
     * @mbg.generated
     */
    public Integer getTopicId() {
        return topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_topic.topic_ID
     *
     * @param topicId the value for wb_topic.topic_ID
     *
     * @mbg.generated
     */
    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_topic.uid
     *
     * @return the value of wb_topic.uid
     *
     * @mbg.generated
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_topic.uid
     *
     * @param uid the value for wb_topic.uid
     *
     * @mbg.generated
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_topic.topic
     *
     * @return the value of wb_topic.topic
     *
     * @mbg.generated
     */
    public Integer getTopic() {
        return topic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_topic.topic
     *
     * @param topic the value for wb_topic.topic
     *
     * @mbg.generated
     */
    public void setTopic(Integer topic) {
        this.topic = topic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_topic.topic_cont
     *
     * @return the value of wb_topic.topic_cont
     *
     * @mbg.generated
     */
    public String getTopicCont() {
        return topicCont;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_topic.topic_cont
     *
     * @param topicCont the value for wb_topic.topic_cont
     *
     * @mbg.generated
     */
    public void setTopicCont(String topicCont) {
        this.topicCont = topicCont == null ? null : topicCont.trim();
    }
}