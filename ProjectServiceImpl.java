/**
 * @description 
 * @date 2016-10-16
 * @author hxg	
 */
package UTS.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import UTS.service.IProjectService;

import com.entity.UserTest;

public class ProjectServiceImpl implements IProjectService {
	@Resource
	 QueryRunner queryRunner;

	@Override
	public List<UserTest> findAll() throws Exception {
		String sql = "select * from tb_user";
		List<UserTest> users = queryRunner.query(sql,
				new BeanListHandler<UserTest>(UserTest.class));
		return users;
	}

}
