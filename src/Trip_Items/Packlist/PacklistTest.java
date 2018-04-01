package Trip_Items.Packlist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacklistTest {

    @AfterEach
    void tearDown() {
    }

    @Test
    void stuff() {
    }

    @Test
    void packList() {
        String name = "Common Stuff";
        Packlist packlist = new Packlist(name);
        Stuff stuff1 = new Stuff("tickets", "Important");
        Stuff stuff2 = new Stuff("toys", "Less important");
        Stuff stuff3 = new Stuff("food", "Important");

        // check name
        {
           assertTrue(packlist.getName().equals(name));
        }

        // check add
        {
            packlist.add(stuff1);
            packlist.add(stuff2);
            packlist.add(stuff3);
            assertTrue(packlist.contains(stuff1));
            assertTrue(packlist.contains(stuff2));
            assertTrue(packlist.contains(stuff3));
            for (Stuff s: packlist) {
                System.out.println(s.getName());
            }
        }

        // check remove by stuff name
        {
            packlist.remove("toys");
            assertFalse(packlist.contains(stuff2));
        }

        //check find
        {
            Stuff stuff = packlist.find("food");
            assertTrue(stuff.getGroupName().equals("Important"));
        }
    }
}