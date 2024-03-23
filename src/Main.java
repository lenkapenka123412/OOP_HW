import java.util.ArrayList;
import java.util.List;

public class Main {
    // Задача — 1 Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
    // содержащий в себе методы initProducts (List <Product>)
    // сохраняющий в себе список исходных продуктов и getProduct(String name)

    //Задача 2 — Реализуйте конструкторы, get/set методы, постройте логику ТорговогоАвтомата
    // на основе кода сделанного в предыдущем задании.

    //Задача 3 — Сделайте класс Товар абстрактным, создайте нескольких наследников
    // (к примеру: БутылкаВоды), сделайте интерфейсом ТорговыйАвтомат и реализуйте
    // класс какого-то одного типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)

    // Задача 4 — Переопределите метод toString для Товара, запустите программу,
    // после этого переопределите для наследника этот метод, после запуска обратите
    // внимание на изменение поведения.
    //
    // Создайте перегруженный метод выдачи товара ТорговымАвтоматом дополнив дополнительным
    // входным параметром (пример: getProduct(String name) выдающий товар по имени,
    // создайте метод возвращающий товар по имени и какому-либо параметру товара
    // getProduct(String name, int volume)

    //Домашняя работа

    // 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным
    // полем int температура..

    // 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
    // перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
    // соответствующий имени, объему и температуре
    public static void main(String[] args) {

        BottleOfWater bottleOfWater1 = new BottleOfWater("Миргород", 140, 2);
        BottleOfWater bottleOfWater2 = new BottleOfWater("Святой источник", 100, 2);
        BottleOfWater bottleOfWater3 = new BottleOfWater("Дарида-Аква", 110, 1);
        BottleOfWater bottleOfWater4 = new BottleOfWater("Черноголовка", 130, 3);
        BottleOfWater bottleOfWater5 = new BottleOfWater("Бонаква", 100, 1);

        Product hotDrink1 = new HotDrink("Капучино", 70, 2);
        Product hotDrink2 = new HotDrink("Макиато", 80, 2);
        Product hotDrink3 = new HotDrink("Американо", 100,  4);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(bottleOfWater5);
        products.add(hotDrink1);
        products.add(hotDrink2);
        products.add(hotDrink3);

        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(products);

        BottleOfWater bottleOfWaterRes =  machine.getProduct("Бонаква", 1);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.getName() + " — " + bottleOfWaterRes.getVolume());
        }
        else {
            System.out.println("Такого напитка нет в автомате.");
        }


        BottleOfWater hotDrink =  machine.getProduct("Молочный мир", 4);
        if (hotDrink != null){
            System.out.println("Вы купили: ");
            System.out.println(hotDrink.getName());
        }
        else {
            System.out.println("Такого напитка нет в автомате.");
        }
    }
}

