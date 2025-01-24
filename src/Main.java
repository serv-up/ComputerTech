import main.dao.ShopImpl;
import main.models.Disk;
import main.models.Notebook;
import main.models.Ram;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Notebook> listNotebooks = new ArrayList<>();
        ShopImpl repository = new ShopImpl(listNotebooks);
        Ram ram1 = new Ram(16, "DDR4");
        Disk disk1 = new Disk(500, "SSD");
        Notebook notebook1 = new Notebook(ram1, disk1, "AMD Ryzen 7");
        repository.addNotebook(notebook1);
        System.out.println(notebook1);
        System.out.println(listNotebooks);
    }
}