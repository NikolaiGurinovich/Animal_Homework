public class Animal {
    private String name;
    private String food;
    private String voice;


    public String voice(String voice){
        return voice;
    }

    public String eat(Food food) {
        return "------";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}
