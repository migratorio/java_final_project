//package ru.gb;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int foodToDecrease) {
        if (food >= foodToDecrease) {
            food = food - foodToDecrease;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Plate[" + food + "]";
    }

    public boolean isEmpty() {
        if (food > 3 ) return false;
        else return true;
    }

    public int increaseFood(){
        food += 2;
        return food;
    }

}
