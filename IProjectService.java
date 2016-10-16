/**
 * @description 
 * @date 2016-10-16
 * @author hxg	
 */
package UTS.service;

import java.util.List;

import com.entity.UserTest;

public interface IProjectService {
	List<UserTest> findAll() throws Exception;
}
