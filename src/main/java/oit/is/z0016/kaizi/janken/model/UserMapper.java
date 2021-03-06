package oit.is.z0016.kaizi.janken.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
  @Select("SELECT id,user from users")
  ArrayList<User> selectAllUsers();

  @Select("SELECT id,user from users where id = #{id}")
  User selectById(int id);

  @Select("SELECT id,user from users where user = #{user}")
  User selectByUser(String user);

}
