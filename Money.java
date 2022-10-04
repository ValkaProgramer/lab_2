class Money{
    private int amount;

    public int getAmount() {
        return amount;
    }

    public Money(){
        this.amount = 0;
    }

    public void Add(int add){
        amount += add;
    }
}