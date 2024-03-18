package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import java.util.UUID;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

public class FamilySearchCommand extends Command {
    public static final String COMMAND_WORD = "familySearch";
    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": finds the relationship pathway of the family member identified "
            + "by the last four digits of the family member listed\n"
            + "";
    public static final String MESSAGE_NOT_IMPLEMENTED_YET =
            "I HAVEN'T COOK FAMILYSEARCH YET";
    public static final String MESSAGE_ARGUMENTS = "UUID: ";

    private String targetUUID;

    public FamilySearchCommand(String uuid) {
        requireNonNull(uuid);
        this.targetUUID = uuid;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        throw new CommandException(MESSAGE_USAGE + targetUUID.toString());
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FamilySearchCommand)) {
            return false;
        }
        FamilySearchCommand otherCommand = (FamilySearchCommand) other;
        return this.targetUUID.equals(otherCommand.targetUUID);
    }

}
