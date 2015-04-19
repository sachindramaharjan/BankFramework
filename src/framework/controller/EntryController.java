package framework.controller;

import framework.interfaces.Controller;
import framework.interfaces.Event;
import framework.service.IEntryService;

public class EntryController implements Controller {
	IEntryService entryService;

	@Override
	public void performAction(Event e) {
		e.execute();
	}

	public IEntryService getEntryService() {
		return entryService;
	}

	public void setEntryService(IEntryService entryService) {
		this.entryService = entryService;
	}

}
