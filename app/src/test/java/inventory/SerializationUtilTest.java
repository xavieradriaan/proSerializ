package inventory;

import org.junit.Test;
import static org.junit.Assert.*;

public class SerializationUtilTest {

    @Test
    public void testSerializeDeserialize() {
        InventoryItem item = new InventoryItem("Laptop", 5, 1000.0);
        byte[] serializedItem = SerializationUtil.serialize(item);
        InventoryItem deserializedItem = SerializationUtil.deserializeInventoryItem(serializedItem,
                InventoryItem.class);
        assertEquals(item.getName(), deserializedItem.getName());
        assertEquals(item.getQuantity(), deserializedItem.getQuantity());
        assertEquals(item.getPrice(), deserializedItem.getPrice(), 0.001);
    }

    @Test
    public void testSerializeNullObject() {
        // Prueba para verificar que serialize retorna null para un objeto nulo
        byte[] serializedNull = SerializationUtil.serialize(null);
        assertNull(serializedNull);
    }

}