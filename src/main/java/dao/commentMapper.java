package dao;

import entity.comment;
import entity.commentExample;
import java.util.List;

public interface commentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(comment record);

    int insertSelective(comment record);

    List<comment> selectByExample(commentExample example);

    comment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(comment record);

    int updateByPrimaryKey(comment record);
}