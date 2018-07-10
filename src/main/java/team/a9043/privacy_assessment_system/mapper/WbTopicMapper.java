package team.a9043.privacy_assessment_system.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.a9043.privacy_assessment_system.pojo.WbTopic;
import team.a9043.privacy_assessment_system.pojo.WbTopicExample;

public interface WbTopicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_topic
     *
     * @mbg.generated
     */
    long countByExample(WbTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_topic
     *
     * @mbg.generated
     */
    int deleteByExample(WbTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_topic
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer topicId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_topic
     *
     * @mbg.generated
     */
    int insert(WbTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_topic
     *
     * @mbg.generated
     */
    int insertSelective(WbTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_topic
     *
     * @mbg.generated
     */
    List<WbTopic> selectByExample(WbTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_topic
     *
     * @mbg.generated
     */
    WbTopic selectByPrimaryKey(Integer topicId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_topic
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") WbTopic record, @Param("example") WbTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_topic
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") WbTopic record, @Param("example") WbTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_topic
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(WbTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_topic
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(WbTopic record);
}