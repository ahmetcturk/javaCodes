package week6Tuesday;

public class YoutubePageTest {

	public static void main(String[] args) {
		
		YoutubePage youtubePage1 = new YoutubePage();
		youtubePage1.topicOfVideo = "Relaxing Musics";
		youtubePage1.numberOfLikes = 1000000;
		youtubePage1.numberOfDislikes = 90;
		
		System.out.println(youtubePage1.topicOfVideo);
		System.out.println(youtubePage1.numberOfLikes);
		System.out.println(youtubePage1.numberOfDislikes);
		
		youtubePage1.goToHistory();

	}

}
