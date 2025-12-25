package service;

import model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemService {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void showAllItems() {
        items.forEach(item -> System.out.println(item));
    }

    public void markItemDone(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                item.markCompleted();
                System.out.println("Done!");
                return;
            }
        }
        System.out.println("Not found!");
    }

    public void showSuggestions() {
        long open = items.stream()
                .filter(item -> !item.isCompleted())
                .count();

        if (open >= 3) {
            System.out.println("You have many open items!");
        } else {
            System.out.println("Good job!");
        }
    }
}
