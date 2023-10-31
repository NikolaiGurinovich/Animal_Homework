public class Rabbit extends Animal{
    private String voice = "?";

    private String goodAnswer = "good";

    private String notGoodAnswer = "not good";


    public String voice(){
        return voice;
    }

    public String eat(Food food) {
        if(food == Food.GRASS) {
            return goodAnswer;
        }else {
            return notGoodAnswer;
        }
    }

    public String eat(String food) {
        if(food.toLowerCase().equals("grass")) {
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
