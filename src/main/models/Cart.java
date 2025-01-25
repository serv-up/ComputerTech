package main.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс Cart представляет корзину покупок пользователя в интернет-магазине.
 * Хранит список товаров, их общую стоимость и информацию о владельце корзины.
 */
public class Cart {
    /** Список устройств в корзине */
    private final List<Device> items;
    /** Общая стоимость всех товаров в корзине */
    private double totalPrice;
    /** Пользователь, которому принадлежит корзина */
    private final User user;

    /**
     * Создает новую корзину для указанного пользователя.
     * @param user пользователь, которому будет принадлежать корзина
     */
    public Cart(User user) {
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
        this.user = user;
    }

    /**
     * Добавляет устройство в корзину и пересчитывает общую стоимость.
     * @param device устройство, которое нужно добавить в корзину
     */
    public void addItem(Device device) {
        items.add(device);
        calculateTotalPrice();
    }

    /**
     * Удаляет устройство из корзины и пересчитывает общую стоимость.
     * @param device устройство, которое нужно удалить из корзины
     */
    public void removeItem(Device device) {
        items.remove(device);
        calculateTotalPrice();
    }

    /**
     * Пересчитывает общую стоимость всех товаров в корзине.
     * Вызывается автоматически при добавлении или удалении товаров.
     */
    private void calculateTotalPrice() {
        this.totalPrice = 0.0;
        for (Device device : items) {
            this.totalPrice += device.getPrice();
        }
    }

    /**
     * Очищает корзину от всех товаров и обнуляет общую стоимость.
     */
    public void clearCart() {
        items.clear();
        totalPrice = 0.0;
    }

    /**
     * Возвращает копию списка товаров в корзине.
     * @return новый список, содержащий все товары из корзины
     */
    public List<Device> getItems() {
        return new ArrayList<>(items);
    }

    /**
     * Возвращает общую стоимость всех товаров в корзине.
     * @return общая стоимость корзины
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Возвращает пользователя, которому принадлежит корзина.
     * @return владелец корзины
     */
    public User getUser() {
        return user;
    }

    /**
     * Возвращает количество товаров в корзине.
     * @return количество товаров
     */
    public int getItemCount() {
        return items.size();
    }
}
