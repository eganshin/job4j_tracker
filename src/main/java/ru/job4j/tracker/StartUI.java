package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        System.out.println("Текущие дата и время ДО форматирования: " + item.getCreated());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = item.getCreated().format(formatter);
        System.out.println("Текущие дата и время ПОСЛЕ форматирования: " + currentDateTimeFormat);
        System.out.println(item);

        String itemCreated = "Item{"
                + "id=" + item.getId()
                + ", name='" + item.getName() + '\''
                + ", created=" + currentDateTimeFormat
                + '}';
        System.out.println("Отображение даты не изменилось? " + item.toString().equals(itemCreated));
    }
}