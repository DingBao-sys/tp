package seedu.address.model.person.relationship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Manages all the relationships of a person
 */
public class RelationshipManager {
    /**
     * HashMap where the keys are the RelationshipTypes and the values are all the relationships of the type
     * Example: key: friends -> List of friends
     */
    private Map<String, List<Relationship>> typeToListOfRelationshipsMap = new HashMap<>();

    public RelationshipManager() {}
    public void addRelationship(String relationshipType, Relationship relationship) {
        Function<? super String, ? extends List<Relationship>> lambdaToFillEmptyKey = key -> new ArrayList<>();
        typeToListOfRelationshipsMap.computeIfAbsent(
                relationshipType, lambdaToFillEmptyKey).add(relationship);
    }

    public void deleteRelationship(String relationshipType, Relationship relationship) {
       List<Relationship> currentListMappedToType = typeToListOfRelationshipsMap.get(relationshipType);
       currentListMappedToType.remove(relationship);
    }

    // Get relationships by type
    public List<Relationship> getRelationships(String relationshipType) {
        return typeToListOfRelationshipsMap.getOrDefault(relationshipType, Collections.emptyList());
    }
}
