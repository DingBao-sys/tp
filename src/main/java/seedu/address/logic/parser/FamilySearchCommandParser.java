package seedu.address.logic.parser;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import java.util.UUID;

import seedu.address.logic.commands.FamilySearchCommand;
import seedu.address.logic.parser.exceptions.ParseException;

public class FamilySearchCommandParser implements Parser<FamilySearchCommand> {

    public FamilySearchCommand parse(String args) throws ParseException {
        requireNonNull(args);
        try {
            String lastFourDigits = ParserUtil.parseUUID(args);
            return new FamilySearchCommand(lastFourDigits);
        } catch (ParseException e) {
            throw new ParseException(MESSAGE_INVALID_COMMAND_FORMAT
                    + "\n"
                    + FamilySearchCommand.MESSAGE_USAGE
                    + "\n"
                    + e);
        }
    }
}
