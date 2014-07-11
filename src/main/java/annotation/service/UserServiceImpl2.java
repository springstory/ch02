package annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl2 implements UserService {

	@Autowired
	private UserDao userDao;
	
	public String getHelloMessage() {
		return "안녕하세요 " + userDao.getName() + " 님";
	}
}
