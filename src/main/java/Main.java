import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Main {

  public static void main(String[] args) {
    UUID uuid = UUID.randomUUID();
    Map<UUID, Integer> itemGroupFormCountMap = new HashMap<>();
    Integer x = itemGroupFormCountMap.get(uuid);
    System.out.println(x);
    itemGroupFormCountMap.replace(uuid, x + 1);
    System.out.println(itemGroupFormCountMap);
  }
}
