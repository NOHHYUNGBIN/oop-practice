package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    void volumeUp() {
        volume++;
        System.out.println("volume = " + volume);
    }
    void volumeDown() {
        volume--;
        System.out.println("volume = " + volume);
    }
    void showStatus() {
        System.out.println("음악 플레이어 상태확인");
        if(this.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
