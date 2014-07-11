package collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
	private List<String> userList;
	private Set<String> userSet;
	private Map<String, User> userMap;
	private Properties userProp;

	public List<String> getUserList() {
		return userList;
	}

	public void setUserList(List<String> userList) {
		this.userList = userList;
	}

	public Set<String> getUserSet() {
		return userSet;
	}

	public void setUserSet(Set<String> userSet) {
		this.userSet = userSet;
	}

	public Map<String, User> getUserMap() {
		return userMap;
	}

	public void setUserMap(Map<String, User> userMap) {
		this.userMap = userMap;
	}

	public Properties getUserProp() {
		return userProp;
	}

	public void setUserProp(Properties userProp) {
		this.userProp = userProp;
	}

	@Override
	public String toString() {
		return "CollectionBean [userList=" + userList + ", userSet=" + userSet
				+ ", userMap=" + userMap + ", userProp=" + userProp + "]";
	}

}
