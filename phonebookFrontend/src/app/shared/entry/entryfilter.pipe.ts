import { Pipe, PipeTransform } from '@angular/core';

import { Entry } from '../models/entry.model';
@Pipe({
	name: 'entryFilter'
})

export class EntryFilterPipe implements PipeTransform {
	transform(entries: Entry[], searchText: string): Entry[] {
		if(!entries) {
			return [];
		}
		if(!searchText){
			return entries;
		}

		searchText = searchText.toLowerCase();

		return entries.filter( entry => {
			return entry.name.toLowerCase().includes(searchText);
		});
	}
}