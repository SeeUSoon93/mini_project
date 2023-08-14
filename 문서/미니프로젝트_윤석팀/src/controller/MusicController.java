package controller;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
import model.MusicDTO;

public class MusicController {
	ArrayList<MusicDTO> bgmList = new ArrayList<MusicDTO>();

	int index = 0;

	MP3Player mp3 = new MP3Player();

	public MusicController() {

		// 음악 전체 목록
		MusicDTO bgm1 = new MusicDTO("NewJeans", ".\\bgm\\MainBGM.mp3");
		MusicDTO bgm2 = new MusicDTO("NewJeans", ".\\bgm\\SubBGM.mp3");
		MusicDTO bgm3 = new MusicDTO("NewJeans", ".\\bgm\\Ending.mp3");

		bgmList.add(bgm1);
		bgmList.add(bgm2);
		bgmList.add(bgm3);

	}

	public MusicDTO mainBGM() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(bgmList.get(0).getPath());
		return bgmList.get(0);
	}

	public MusicDTO subEvBGM() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(bgmList.get(1).getPath());
		return bgmList.get(1);
	}

	public MusicDTO endingBGM() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(bgmList.get(2).getPath());
		return bgmList.get(2);
	}

	public void stop() {

		if (mp3.isPlaying()) {
			mp3.stop();
		}
	}
}
