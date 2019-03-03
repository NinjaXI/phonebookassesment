import { Entry } from './entry.model'

export class Phonebook {
	constructor(
		public id: number,
		public name: string,
		public defaultbook: boolean,
		public entries: Entry[],
	){}
}
