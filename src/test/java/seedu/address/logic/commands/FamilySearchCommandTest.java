package seedu.address.logic.commands;


import static seedu.address.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.address.logic.commands.CommandTestUtil.VALID_LAST_FOUR_DIGITS_UUID;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_LAST_FOUR_DIGITS_UUID;
import static seedu.address.logic.commands.FamilySearchCommand.MESSAGE_ARGUMENTS;
import static seedu.address.logic.commands.FamilySearchCommand.MESSAGE_USAGE;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;
public class FamilySearchCommandTest {
    private Model model = new ModelManager(getTypicalAddressBook(), new UserPrefs());

    @Test
    public void execute() {
        final String UUID = "<>??";
        assertCommandFailure(new FamilySearchCommand(UUID), model, MESSAGE_USAGE + UUID);
    }

    //equals method to be implemented
}

