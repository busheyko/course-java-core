package com.rakovets.course.java.core.practice.decision_making_statement;

/**
 * Разработать программу для игрового движка.
 * <p>
 * Необходимо окрасить шкалу HP игрока в соответствующий цвет, в зависимости от процентного соотношения максимального
 * количества HP и текущего.
 *
 * @author Dmitry Rakovets
 */
class Task03 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int currentHealthPoint = 10;
        int maxHealthPoint = 100;

        String colorHealthPoint = getColorHealthPoint(currentHealthPoint, maxHealthPoint);
        System.out.printf("Result: %s", colorHealthPoint);
           }

    /**
     * Возвращает цвет для шкалы HP игрока, в зависимости от процентного соотношения максимального количества HP и
     * текущего. Когда меньше 25% - красный, меньше 50% - оранжевый, меньше 75% - желтый, меньше либо равно 100 -
     * зеленый.
     *
     * @param currentHealthPoint текущее количество HP игрока
     * @param maxHealthPoint     максимальное количество HP игрока
     * @return null/'RED'/'ORANGE'/'YELLOW'/'GREEN'
     */
    static String getColorHealthPoint(float currentHealthPoint, float maxHealthPoint) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String result =null;
        if (currentHealthPoint / maxHealthPoint > 0 && currentHealthPoint / maxHealthPoint < 0.25) {
            result = "RED";
        }
        else if (currentHealthPoint / maxHealthPoint >= 0.25 && currentHealthPoint / maxHealthPoint < 0.5) {
            result = "ORANGE";
        }
        else if (currentHealthPoint / maxHealthPoint >= 0.5 && currentHealthPoint / maxHealthPoint < 0.75) {
            result = "YELLOW";
        }
        else if (currentHealthPoint / maxHealthPoint >= 0.75 && currentHealthPoint / maxHealthPoint <= 1) {
            result = "GREEN";
        }
        return result;
    }
}
