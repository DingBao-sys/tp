package seedu.address.logic.parser;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import java.util.UUID;

import seedu.address.logic.commands.FamilySearchCommand;
import seedu.address.logic.parser.exceptions.ParseException;

public class FamilySearchCommandParser implements Parser<FamilySearchCommand> {

    public FamilySearchCommand parse(String args) throws ParseException {
        requireNonNull(args);
        String[] uuids = args.split(" ", 2);
        String firstUUID = uuids[0];
        String secondUUID = uuids[1];
        try {
            String originUUID = ParserUtil.parseUUID(firstUUID);
            String targetUUID = ParserUtil.parseUUID(secondUUID);
            return new FamilySearchCommand(originUUID, targetUUID);
        } catch (ParseException e) {
            throw new ParseException(MESSAGE_INVALID_COMMAND_FORMAT
                    + "\n"
                    + FamilySearchCommand.MESSAGE_USAGE
                    + "\n"
                    + e);
        }
    }
}
