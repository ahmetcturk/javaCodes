package week6Lab;

import java.util.ArrayList;

public class YoutubeVideoPage {

	public String videoName;
	public int likeNumber;
	public int dislikeNumber;
	public ArrayList<String> relatedVideos= new ArrayList<>();
	public ArrayList<String> comments = new ArrayList<>();

	public void likeVideo() {
		likeNumber++;
	}

	public void dislikeVideo() {
		dislikeNumber++;
	}
	
	public void addComments(String comment){
		comments.add(comment);
	}

	public static void main(String[] args) {
		YoutubeVideoPage obj = new YoutubeVideoPage();
		obj.addComments("I love this video");
		obj.addComments("Boring video");
		
		System.out.println(obj.comments);
	}

}
