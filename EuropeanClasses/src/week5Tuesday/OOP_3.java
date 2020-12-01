package week5Tuesday;

public class OOP_3 {

	public static void main(String[] args) {
		YoutubeVideo video1 = new YoutubeVideo();
		video1.videoName = "Relaxing Musics";
		
		video1.like();
		video1.like();
		video1.like();
		
		YoutubeVideo video2 = new YoutubeVideo();
	
		video2.videoName = "Data Types in Java";
		video2.like();
		System.out.println(video2.likeNumber);
		
		String []  arr = {"Great Video", "I hate it"};
		video1.comments = arr;
		
		String []  arr2 = {"Very useful", "I don't understand"};
		video2.comments = arr2;
		
		System.out.println(video2.comments[1]);
	}

}

class YoutubeVideo{
	// Attributes
	String [] comments = new String[2];
	String videoName;
	int likeNumber;
	int dislikeNumber;
	// Methods
	void like(){
		likeNumber ++;
	}
	void dislike(){
		dislikeNumber ++;
	}
}