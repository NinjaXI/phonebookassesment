import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PhonebookDisplayComponent } from './phonebook-display.component';

describe('PhonebookDisplayComponent', () => {
  let component: PhonebookDisplayComponent;
  let fixture: ComponentFixture<PhonebookDisplayComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PhonebookDisplayComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PhonebookDisplayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
