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

    public static final String MESSAGE_INVALID_UUID = "The uuid is invalid, either it does not have alphanumeric characters"
            + "or person do not exist";

    private String originUUID;
    private String targetUUID;


    public FamilySearchCommand(String originUUID, String targetUUID) {
        requireNonNull(originUUID);
        requireNonNull(targetUUID);
        this.originUUID = originUUID;
        this.targetUUID = targetUUID;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        //
        if (!model.hasPersonUUID(targetUUID) || !model.hasPersonUUID(originUUID)) {
            throw new CommandException(MESSAGE_INVALID_UUID);
        }
        String getRelationShipPath = model.getRelationshipDescriptor(originUUID, targetUUID);
        return null;
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
