package pl.byd.promand.Team4.twitter;

public class AddMemberTweet extends TaskTweet {
	
	private final String memberName;
	
	public AddMemberTweet(String memberName) {
		super(TweetType.AM);
		this.memberName = memberName;
	}
	
	public String getMemberName() {
		return memberName;
	}

}
