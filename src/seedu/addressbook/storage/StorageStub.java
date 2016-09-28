package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

public class StorageStub extends Storage {
	
	public void save(AddressBook addressBook) throws StorageOperationException {
		// return stub
		return;
	}
	
	public AddressBook load() throws StorageOperationException {
		return new AddressBook();
	}
	
	public String getPath() {
		return "";
	}
}
