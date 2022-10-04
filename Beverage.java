class Beverage{
    public String name;
    public int price, amount, time;
    public Beverage(int id){
        switch(id){
            case 1:
                this.name = "Cappucino";
                this.price = 20;
                this.amount = 200;
                this.time = 4;
                break;
            case 2:
                this.name = "Latte";
                this.price = 25;
                this.amount = 250;
                this.time = 5;
                break;
            case 3:
                this.name = "Frappe";
                this.price = 30;
                this.amount = 300;
                this.time = 6;
                break;
            case 4:
                this.name = "Double Latte";
                this.price = 40;
                this.amount = 350;
                this.time = 5;
                break;
            case 5:
                this.name = "Iced Caramel Latte";
                this.price = 45;
                this.amount = 400;
                this.time = 7;
                break;
            default:
                break;
        }
    }
}