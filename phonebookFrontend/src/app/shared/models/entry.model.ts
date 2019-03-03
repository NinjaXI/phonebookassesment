import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

@NgModule({
  declarations: [],
  imports: [
    CommonModule
  ]
})
export class Entry { 
	constructor(public id?: number, public name?: string, public number?: string, public phonebookId?: number){}
}
