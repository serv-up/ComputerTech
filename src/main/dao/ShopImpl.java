package main.dao;

import main.models.Notebook;

import java.util.List;

public class ShopImpl implements Shop {
    public List<Notebook> notebooks;

    @Override
    public boolean addNotebook(Notebook notebook) {
        notebooks.add(notebook);
        return false;
    }

    @Override
    public boolean removeRemove() {
        return false;
    }

    @Override
    public List<Notebook> getAllNotebooks() {
        return List.of();
    }

    public ShopImpl(List<Notebook> notebooks) {
        this.notebooks = notebooks;
    }
}
