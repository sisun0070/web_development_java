package c14_abstraction.interfaces;

import c14_abstraction.ChannelUpButton;

public class RemoteController {
    // 필드 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    // 추가된 필드
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;
    // 추가된 필드
//    private TemperatureDownButton temperatureDownButton;
//    private TemperatureUpButton temperatureUpButton;



    /*
        AllArgsConstructor를 정의하세요.
     */
    public RemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton, TemperatureDownButton temperatureDownButton, TemperatureUpButton temperatureUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        // 소괄호 내에 매개변수를 수정했기 때문에 이하의 코드가 필요함
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
        // 추가 코드
//        this.temperatureDownButton = temperatureDownButton;
//        this.temperatureUpButton = temperatureUpButton;
    }

    // 메서드 정의
    // PowerButton의 메서드 구현
    public void onPressedPowerButton() {
        powerButton.onPressed();        // 필드로 powerButton 객체를 지니고 있기 때문에
                                        // PowerButton 클래스에서 정의했던 메서드를 호출가능
    }

    // ChannelDownButton의 메서드 구현
    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }
    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    // ChannelUpButton의 메서드 구현
    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }
    public void onUpChannelUpButton() {
        channelUpButton.onUp();
    }






    // VolumeDownButton 메서드 구현 -2개 입니다.
    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    // VolumeUpButton 메서드 구현 -2게 입니다.
    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }
    public void onUpVolumeUpButton() {
        volumeUpButton.onUp();
    }

//
//    public void onPressedTempertureDownButton() {
//        temperatureDownButton.onPressed();
//    }
//    public void onDownTempertureDownButton() {
//        temperatureDownButton.onDown();
//    }
//    public void onPressedTempertureUpButton() {
//        temperatureUpButton.onPressed();
//    }
//    public void onUpTempertureUpButton() {
//        temperatureUpButton.onUp();
//    }

}
