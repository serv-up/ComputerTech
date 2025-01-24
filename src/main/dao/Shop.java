package main.dao;

import main.models.Notebook;

import java.util.List;

public interface Shop {
    public boolean addNotebook(Notebook notebook);

    public boolean removeRemove();

    public List<Notebook> getAllNotebooks();




}
