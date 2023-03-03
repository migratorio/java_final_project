//package ru.gb;

public class Main {

    /**
     * @param args
     * @throws InterruptedException
     * 
     */
    public static void main(String[] args) throws InterruptedException {
        // Кот (имя, аппетит, сытость)
        // Тарелка (содержит какое-то количество еды)
        // Кот ест из тарлеки. Если в тарелке недостаточно еды - кот ее не трогает

        // ДЗ:
        // while (true) -> while (!plate.isEmpty()) +++
        // 1. Создать массив котов. Пусть все коты из массива по очереди едят из одной тарелки. +++
        // В конце каждого цикла мы досыпаем в тарелку еду.+++
        // Для досыпания еды сделать метод increaseFood в классе Plate. +++
        // 2. Поменять поле satiety у кота с boolean на int.
        // Допустим у кота аппетит 10, сытость 3. Значит кот захочет съесть 7 единиц.
        // 3. * Доработать поток thread в классе Cat, чтобы он каждую секунду уменьшал сытость кота на 1.

        Cat[] cats = {
            new Cat("barsik", 10), 
            new Cat("churchill", 22), 
            new Cat("treff", 15), 
            new Cat("man'ka", 14), 
            new Cat("ryjiy", 18)
        };
    
        Plate plate = new Plate(200);

        while (!plate.isEmpty()) {
            //murzik.makeHungry();
            //barsik.makeHungry();
            for (Cat catsCat : cats) {
                catsCat.eat(plate);
                System.out.println(catsCat);
                System.out.println(plate);
            }
            plate.increaseFood();
            System.out.println(plate);
            System.out.println("В миску добавили еду");

            
            

            Thread.sleep(1000);
            

        }
        System.out.println("Game over! Коты умерли от голода!");
    }

}