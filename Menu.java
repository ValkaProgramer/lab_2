class Menu{
    public Beverage[] beverages = new Beverage[5];
    public Menu(){
        this.beverages[0] = new Beverage(1);
        this.beverages[1] = new Beverage(2);
        this.beverages[2] = new Beverage(3);
        this.beverages[3] = new Beverage(4);
        this.beverages[4] = new Beverage(5);
    }

    public void get(){
        for (Beverage beverage : beverages) {
            System.out.println(beverage.name);
            System.out.println(beverage.amount + "gr");
            System.out.println(beverage.price + " MDL");
            System.out.println("---------------------------------------");
        }
    }
}