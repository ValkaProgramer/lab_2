import java.util.Random;
import java.util.Date;

class Main{
    public static void main(String[] args){
        Cooldown mainCooldown = new Cooldown();
        Money todayMoney = new Money();
        Tips todayTips = new Tips();
        Queue mainQueue = new Queue();
        Date moment = new Date();
        long spawnEnd, workEnd, spawnStart = moment.getTime() / 1000,
        workStart = moment.getTime() / 1000;
        Random rand = new Random();
        int processTime = 100;
        boolean emptiness;
        Menu menuObject = new Menu();
        System.out.print("\033[H\033[2J");
        menuObject.get();
        while(true){
            Date date = new Date();
            spawnEnd = date.getTime() / 1000;
            workEnd = date.getTime() / 1000;
            if(mainCooldown.getInterval() < spawnEnd - spawnStart){
                mainCooldown.setInterval(rand.nextInt(3));
                System.out.println("Next visitor in " + mainCooldown.getInterval() + " seconds!!!");
                spawnStart = spawnEnd;
                emptiness = mainQueue.isEmpty();
                mainQueue.enqueue(new Beverage(rand.nextInt(5) + 1));
                if(emptiness) workStart = date.getTime() / 1000;
            }
            if(mainQueue.isEmpty()){
                System.out.println("Waiting for customers...");
            } else {
                processTime = mainQueue.front().time;
            }
            if(processTime < workEnd - workStart && !mainQueue.isEmpty()){
                mainQueue.dequeue(todayMoney);
                System.out.println("Current profit is " + todayMoney.getAmount() + " MDL");
                processTime = mainQueue.front().time;
                workStart = workEnd;
                todayTips.setQuantity(rand.nextInt(9));
                todayTips.getQuantity();
            }
        }
    }
}