import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

import { Phonebook } from '../models/phonebook.model';
import { Entry } from '../models/entry.model';
import { environment } from '../../../environments/environment';

@Injectable({
	providedIn: 'root'
})
export class PhonebookService {

	constructor(private http: HttpClient) { }
	
	getPhonebook(): Observable<Phonebook> {
		return this.http.get(environment.apiEndpoint).pipe(
			map((res: any) => new Phonebook(res.id, res.name, res.defaultbook, res.entries.map(
					(entry: any) => new Entry(entry.id, entry.name, entry.number, entry.phonebookId)
			)))
		);
	}
}
