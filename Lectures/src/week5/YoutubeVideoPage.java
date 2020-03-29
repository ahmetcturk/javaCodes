package week5;

import java.util.ArrayList;
public class YoutubeVideoPage {
String videoName;
int likeNumber;
int dislikeNumber;
ArrayList<String> comments = new ArrayList<String>();
	
ArrayList<String> relatedVideos;

public void likeVideo(){
	likeNumber = likeNumber + 1;// likeNumber++
}
public void dislikeVideo(){
	dislikeNumber = dislikeNumber + 1;// likeNumber++
}
public void addComments(String comment){
	comments.add(comment);
}
public void printComments(){
	for (int i = 0; i < comments.size(); i++) {
		System.out.println(comments.get(i));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YoutubeVideoPage video1 = new YoutubeVideoPage();
		//video1.comments = new ArrayList<>();
		video1.addComments("I love this video");
		video1.addComments("This is so cute");
		video1.addComments("This video is bad");
		video1.printComments();
		video1.likeVideo();
		video1.dislikeVideo();
		System.out.println(video1.likeNumber);
		System.out.println(video1.dislikeNumber);
		

	}

}
