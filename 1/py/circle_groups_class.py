class Circle:
    def __init__(self, x: float, y: float, radius: float):
        self.x = x
        self.y = y
        self.radius = radius

    def intersects(self, other) -> bool:
        """
        Проверяет, пересекается ли этот круг с другим кругом

        :returns: True, если круги пересекаются, иначе False
        """
        pass


def group_circles(circles: list[Circle]):
    """
    Получает на вход список кругов и возвращает список групп кругов.
    Группа кругов - это список кругов, которые пересекаются между собой.

    Круг описан классом Circle.

    :returns: Список групп кругов
    """
    pass


def find_intersecting_circle_groups(circle: Circle, groups: list[list[Circle]]) -> list[int]:
    """
    Ищет в списке групп кругов те, которые пересекаются с заданным кругом.
    Круг пересекается с группой, если хотя один круг из группы пересекается с данным кругов

    :param circle: Круг, который проверяем на пересечение с группами
    :param groups: Список групп, с которыми проверяется пересечение
    :returns: Список индексов групп, с которым пересекается данный круг
    """
    pass


def intersects_group(circle: Circle, group: list[Circle]) -> bool:
    """
    Проверяет, пересекается ли круг с группой кругов. Круг пересекается с группой, если он
    пересекается с хотя бы одним кругом из списка

    :returns: True, если круг пересекается с любым кругом из списка, иначе False
    """
    pass
