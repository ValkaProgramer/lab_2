class Cooldown {
    private int interval;

    public Cooldown(){
        this.interval = 0;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int random) {
        interval = random + 2;
    }
}