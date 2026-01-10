package encapsulation;

public class Instadriver {
	public static void main(String[] args) {
		Instagram i1=new Instagram();
		i1.setPost(18);
		i1.setFollowing(100);
		System.out.println(i1.getPost());
		System.out.println(i1.getFollowing());
	}
}
