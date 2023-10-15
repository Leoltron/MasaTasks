import java.util.ArrayList;
import java.util.List;


public class CircleGrouper {
    public class Circle {
        public double x;
        public double y;
        public double radius;

        public Circle(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        /**
         * Проверяет, пересекается ли этот круг с другим кругом
         *
         * @return true, если круги пересекаются, иначе false
         */
        public boolean Intersects(Circle other) {
            return false;
        }
    }

    /**
     * Получает на вход список кругов и возвращает список групп кругов.
     * Группа кругов - это список кругов, которые пересекаются между собой.
     * Круг описан классом Circle.
     *
     * @return Список групп кругов
     */
    public static List<List<Circle>> GroupCircles(Circle[] circles) {
        return null;
    }

    /**
     * Ищет в списке групп кругов те, которые пересекаются с заданным кругом.
     * Круг пересекается с группой, если хотя один круг из группы пересекается с данным кругов
     *
     * @param circle Круг, который проверяем на пересечение с группами
     * @param groups Список групп, с которыми проверяется пересечение
     * @return Список индексов групп, с которым пересекается данный круг
     */
    public static List<Integer> FindIntersectingCircleGroups(Circle circle, List<List<Circle>> groups) {
        return null;
    }

    /**
     * Проверяет, пересекается ли круг с группой кругов. Круг пересекается с группой, если он
     * пересекается с хотя бы одним кругом из списка
     *
     * @return true, если круг пересекается с любым кругом из списка, иначе false
     */
    public static boolean IntersectsGroup(Circle circle, List<Circle> group) {
        return false;
    }
}