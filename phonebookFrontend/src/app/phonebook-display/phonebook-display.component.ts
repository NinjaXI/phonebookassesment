import { Component, OnInit } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';

import { PhonebookService } from '../shared/phonebook/phonebook.service';
import { EntryService } from '../shared/entry/entry.service';
import { Phonebook } from '../shared/models/phonebook.model';
import { Entry } from '../shared/models/entry.model';
@Component({
  selector: 'app-phonebook-display',
  templateUrl: './phonebook-display.component.html',
  styleUrls: ['./phonebook-display.component.css']
})
export class PhonebookDisplayComponent implements OnInit {
	phonebook: Phonebook;
	newEntry: Entry;

	constructor(private phonebookService: PhonebookService, 
			private entryService: EntryService,
			private modalService: NgbModal) { }

	ngOnInit() {
		this.loadPhonebook();
	}
	
	loadPhonebook(){
		this.phonebookService.getPhonebook().subscribe((phonebook: Phonebook) => {
			this.phonebook = phonebook;
		});
		
		this.newEntry = new Entry();
	}
	
	openModal(addEntry){
		//console.log(addEntry);
		this.modalService.open(addEntry);
	}
	
	saveEntry(){
		this.newEntry.phonebookId = this.phonebook.id;
		this.entryService.addEntry(this.newEntry);
		
		this.loadPhonebook();
	}

}
