package org.java.bi.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.java.bi.db.domain.BCorpInfo;
import org.java.bi.db.domain.BCorpInfoExample;

public interface BCorpInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     */
    long countByExample(BCorpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     */
    int deleteByExample(BCorpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     */
    int insert(BCorpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     */
    int insertSelective(BCorpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    BCorpInfo selectOneByExample(BCorpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    BCorpInfo selectOneByExampleSelective(@Param("example") BCorpInfoExample example, @Param("selective") BCorpInfo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    BCorpInfo selectOneByExampleWithBLOBs(BCorpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<BCorpInfo> selectByExampleSelective(@Param("example") BCorpInfoExample example, @Param("selective") BCorpInfo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     */
    List<BCorpInfo> selectByExampleWithBLOBs(BCorpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     */
    List<BCorpInfo> selectByExample(BCorpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    BCorpInfo selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") BCorpInfo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     */
    BCorpInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    BCorpInfo selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") BCorpInfo record, @Param("example") BCorpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") BCorpInfo record, @Param("example") BCorpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") BCorpInfo record, @Param("example") BCorpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(BCorpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(BCorpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(BCorpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") BCorpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_corp_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}