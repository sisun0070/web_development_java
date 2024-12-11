package c14_abstraction.interfaces;

public class AirConditionerController {

    // 필드 선언
//    PowerButton powerButton;
//    TemperatureDownButton temperatureDownButton;
//    TemperatureUpButton temperatureUpButton;
    private PowerButton powerButton;
    private TemperatureDownButton temperatureDownButton;
    private TemperatureUpButton temperatureUpButton;

    // AllArgsConstructor 선언
    public AirConditionerController(PowerButton powerButton, TemperatureDownButton temperatureDownButton, TemperatureUpButton temperatureUpButton) {
        this.powerButton = powerButton;
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
    }


    public void onPressedPowerButton() {
        powerButton.onPressed();        // 필드로 powerButton 객체를 지니고 있기 때문에
        // PowerButton 클래스에서 정의했던 메서드를 호출가능
    }


    public void onPressedTemperatureDownButton() {
        temperatureDownButton.onPressed();
    }

    public void onDownTemperatureDownButton() {
        temperatureDownButton.onDown();
    }

    public void onPressedTemperatureUpButton() {
        temperatureUpButton.onPressed();
    }

    public void onUpTemperatureUpBUtton() {
        temperatureUpButton.onUp();
    }


}
