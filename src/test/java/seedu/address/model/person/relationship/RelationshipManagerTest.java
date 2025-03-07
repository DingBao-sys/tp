package seedu.address.model.person.relationship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import org.junit.jupiter.api.Test;

public class RelationshipManagerTest {

    @Test
    public void addRelationship_getRelationships_returnsCorrectRelationships() {
        RelationshipManager manager = new RelationshipManager();
        UUID person1 = UUID.randomUUID();
        UUID person2 = UUID.randomUUID();
        Relationship relationship = new Relationship(person1, person2) {
        };
        manager.addRelationship("friends", relationship);
        assertEquals(1, manager.getRelationships("friends").size());
        assertTrue(manager.getRelationships("family").isEmpty());
    }
}
