public class Dog extends Animal{
    private String voice = "Gav Gav";

    private String goodAnswer = "good";

    private String notGoodAnswer = "not good";


    public String voice(){
        return voice;
    }

    public String eat(Food food) {
        if(food == Food.MEAT) {
            return goodAnswer;
        }else {
            return notGoodAnswer;
        }
    }

    public String eat(String food) {
        if(food.toLowerCase().equals("meat")) {
            return goodAnswer;
        }else {
            return notGoodAnswer;
        }
    }

    @Override
    public String getVoice() {
        return voice;
    }

    @Override
    public void setVoice(String voice) {
        this.voice = voice;
    }
}
