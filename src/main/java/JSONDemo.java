import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import org.json.simple.JSONArray;

public class JSONDemo {
    public static void main(String[] args){
        ElementVisitor visitor = new ElementVisitor();
        DwarfFactory dwarfFactory = new DwarfFactory();
        ElfFactory elfFactory = new ElfFactory();

        ArrayList<TreeMap<String, String>> charactersData = new ArrayList<>();
        TreeMap<String, String> characterData;

        try(FileWriter output = new FileWriter("output.json")){

            characterData = new TreeMap<>();

            Character dwarf = new Character("Ratuj", dwarfFactory.create());
            dwarf.addRaceBonuses();
            dwarf.talk();
            dwarf.accept(visitor, characterData);

            charactersData.add(characterData);

            Character elf = new Character("Tyhfer", elfFactory.create());
            elf.addRaceBonuses();
            elf.talk();
            elf.accept(visitor, characterData);

            charactersData.add(characterData);

            JSONArray jsonArray = new JSONArray();
            jsonArray.addAll(charactersData);
            output.write(jsonArray.toJSONString());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
