package com.company;

import com.company.combination.Menu;
import com.company.combination.MenuComponent;
import com.company.combination.MenuItem;
import com.company.combination.Waitress;
import com.company.state.GumBallMachine;


public class Main {

    public static void main(String[] args) {
        // write your code here
//策略模式
//        Duck duck = new MallardDuck();
//        duck.dislay();
//        duck.performFly();

//观察者模式
//        WeatherData weatherData = new WeatherData();
//        CurrentConditionsDisplay currentDisplay =
//                new CurrentConditionsDisplay(weatherData);
//        weatherData.setMeasurements(80, 65, 30.4f);

//装饰者模式
//        //初始对象
//        Beverage beverage = new MyBeverage();
//        //包装后的对象
//        beverage = new MyCondiment(beverage);
//        beverage = new MyCondiment(beverage);
//        beverage = new MyCondiment(beverage);
//        System.out.println(beverage.getDescription() + " " + beverage.cost());

//简单工厂
//        SimpleFactory simpleFactory = new SimpleFactory();
//        PizzaStore pizzaStore = new PizzaStore(simpleFactory);
//        pizzaStore.orderPizza("myFristPizza");

//工厂
//        PizzaStore pizzaStore = new MyFirstPizzaStroe();
//        Pizza pizza = pizzaStore.orderPizza("myThirdPizza");
//        pizza.display();
//
//        PizzaStore pizzaStore2 = new MySecondPizzaStore();
//        Pizza pizza2 = pizzaStore2.orderPizza("myFristPizza");
//        pizza2.display();

//抽象工厂
//        PizzaStore pizzaStore = new PizzaStoreOne();
//        pizzaStore.creatPizza();

//单例模式
//        Singleton singleton = Singleton.getSingleton();
//        singleton.diasplay();


//命令模式
//        RemoteControl remoteControl = new RemoteControl();
//        Light light = new Light();
//        Command command = new LightOnCommand(light);
//        remoteControl.setCommand(command);
//        remoteControl.buttonPressed();


// 适配器模式
//        Turkey turkey = new WildTurkey();
//        Duck fakeDuck = new TurkeyAdapter(turkey);
//        fakeDuck.dislay();
//        fakeDuck.performFly();

//模板模式
//        Template template = new MakeTemplateone();
//        template.callMethods();
//
//        System.out.println("new template");
//
//        template = new MakeTemplatetwo();
//        template.callMethods();


//迭代器模式
//        ArrayList<Menu> menus = new ArrayList();
//        menus.add(new BreakFastMenu());
//        menus.add(new LunchMenu());
//        Waitress waitress = new Waitress(menus);
//        waitress.printMenu();


// 组合模式
//创建所有的菜单对象
//        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
//        MenuComponent denerMenu = new Menu("DINER MENU","Lunch");
//        MenuComponent cafeMenu = new Menu("CAFE MENU","Dinner");
//        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course!");
//        //创建一个顶层的菜单
//        MenuComponent allMenus = new Menu("ALL MENUS","All menus combined");
//        //组合方式，将每个菜单都加入到顶层菜单中
//        allMenus.add(pancakeHouseMenu);
//        allMenus.add(denerMenu);
//        allMenus.add(cafeMenu);
//        denerMenu.add(new MenuItem("素食BLT","（煎）培根、生菜&西红柿、面包",true,2.99));
//        denerMenu.add(new MenuItem("BLT","培根、生菜&西红柿",false,3.99));
//        denerMenu.add(new MenuItem("例汤","一碗例汤，配土豆沙拉",true,4.99));
//        denerMenu.add(new MenuItem("热狗","热狗、酸菜、上盖芝士",false,5.99));
//        denerMenu.add(new MenuItem("清蒸时蔬加糙米","清蒸时蔬加糙米",true,5.99));
//        denerMenu.add(dessertMenu);
//        dessertMenu.add(new MenuItem("Apple Pie","Apple pie with a flakey crust,topped with vanilla ice cream",true,1.59));
//        pancakeHouseMenu.add(new MenuItem("K&B's薄煎饼早餐","薄煎饼、清蛋和土司",true,2.99));
//        pancakeHouseMenu.add(new MenuItem("薄煎饼早餐例餐","薄煎饼带煎蛋、香肠",false,4.99));
//        pancakeHouseMenu.add(new MenuItem("蓝莓薄煎饼","新鲜蓝莓和蓝莓糖浆做成的薄煎饼",true,1.99));
//        pancakeHouseMenu.add(new MenuItem("松饼","松饼、可以选择蓝莓或草莓",true,3.99));
//        cafeMenu.add(new MenuItem("摩卡咖啡","加糖的摩卡卡法",false,3.99));
//        cafeMenu.add(new MenuItem("卡布奇洛","加奶的卡布奇洛",false,4.99));
//        cafeMenu.add(new MenuItem("圣雪滴蓝","加巧克力的咖啡",false,5.23));
//        Waitress waitress = new Waitress(allMenus);
//        waitress.printVegetarianMenu();


//状态模式
//        GumBallMachine gumBallMachine = new GumBallMachine(100);
//        for (int i=0;i<110;i++){
//            gumBallMachine.insertCoin();
//            gumBallMachine.turnCrank();
//        }





    }
}
