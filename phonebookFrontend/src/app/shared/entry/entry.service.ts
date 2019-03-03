import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, Subscription } from 'rxjs';

import { Entry } from '../models/entry.model';
import { environment } from '../../../environments/environment';

@Injectable({
	providedIn: 'root'
})
export class EntryService {

	constructor(private http: HttpClient) { }
	
	addEntry(entry: Entry): Subscription{
		//console.log(entry.name)
		let options = { headers: new HttpHeaders({ 'Content-Type': 'application/json' })};
		return this.http.post<Entry>(environment.apiEndpoint + '/addEntry', entry, options).subscribe();
	}
}
