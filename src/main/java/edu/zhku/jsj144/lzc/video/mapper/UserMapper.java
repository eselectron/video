package edu.zhku.jsj144.lzc.video.mapper;

import edu.zhku.jsj144.lzc.video.pojo.Admin;
import edu.zhku.jsj144.lzc.video.pojo.User;
import edu.zhku.jsj144.lzc.video.pojo.UserEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

	public User selectUserByName(String username);

	public Admin selectAdminByName(String username);
	
	public User selectUserById(String id);

    public Admin selectAdminById(String id);

	public List<UserEx> selectUsers(@Param("pstart") int pstart, @Param("psize") int psize);

	public List<UserEx> selectUsersByUID(@Param("mineId") String mineId, @Param("pstart") int pstart, @Param("psize") int psize);

	public List<UserEx> selectUsersByUsername(@Param("username") String username, @Param("pstart") int pstart, @Param("psize") int psize);

	public void updatePassword(@Param("id") String id, @Param("pwd") String pwd);

	public void updateAdminPassword(@Param("id") String id, @Param("pwd") String pwd);

    public void updateInfo(@Param("id") String id, @Param("username") String username, @Param("description") String description);
}
