package inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<InventoryItem> inventory;

    public InventoryManager() {
        this.inventory = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        inventory.add(item);
    }

    public void removeItem(InventoryItem item) {
        inventory.remove(item);
    }

    public void updateItem(InventoryItem item) {
        // Implementar lógica de actualización del item en el inventario
    }

    // Otros métodos según sea necesario
}
