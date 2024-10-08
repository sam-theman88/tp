package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.address.logic.commands.ListDoctorCommand.MESSAGE_NOT_IMPLEMENTED_YET;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

import org.junit.jupiter.api.Test;

import seedu.address.commons.util.ToStringBuilder;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;

/**
 * Contains integration tests (interaction with the Model) for {@code ListDoctorCommand}.
 */
public class ListDoctorCommandTest {
    private final Model model = new ModelManager(getTypicalAddressBook(), new UserPrefs());

    /**
     * Tests whether the {@code ListDoctorCommand} equals method works as expected.
     * Two commands should be equal if they are the same object or if they are both instances of
     * {@code ListDoctorCommand}.
     */
    @Test
    public void equals() {
        ListDoctorCommand listDoctorCommand = new ListDoctorCommand();
        ListDoctorCommand listDoctorCommandCopy = new ListDoctorCommand();
        // same values -> returns true
        assertEquals(listDoctorCommand, listDoctorCommandCopy);
        assertNotEquals(listDoctorCommand, null); // Null check -> returns false

    }

    /**
     * Tests that {@code ListDoctorCommand} execution fails with a {@code CommandException}
     * and the message "list-doctor command not implemented yet".
     */
    @Test
    public void execute() {
        assertCommandFailure(new ListDoctorCommand(), model, MESSAGE_NOT_IMPLEMENTED_YET);
    }

    /**
     * Tests if {@code ListDoctorCommand} toString method returns the expected string.
     */
    @Test
    public void toString_validCommand_returnsExpectedString() {
        ListDoctorCommand command = new ListDoctorCommand();
        String expectedString = new ToStringBuilder(command)
                .add("commandWord", ListDoctorCommand.COMMAND_WORD)
                .toString();
        assertEquals(expectedString, command.toString()); // Check if the string matches
    }
}
