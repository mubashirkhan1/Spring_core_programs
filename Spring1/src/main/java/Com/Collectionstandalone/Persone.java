package Com.Collectionstandalone;

import java.util.List;

public class Persone {
	private List<String> friends;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Persone [friends=" + friends + "]";
	}		

}
