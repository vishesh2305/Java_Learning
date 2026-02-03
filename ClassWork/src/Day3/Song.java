package Day3;

public class Song {
	String title;
	String artist;

	void play() {
		System.out.println(artist + " is singing : " + title);

	}

	public static void main(String[] args) {
		Song track1 = new Song();
		track1.artist = "Lata Mangeshkar";
		track1.title = "Vande Matram";

		track1.play();

		Song track2 = new Song();
		track2.play();

	}

}
