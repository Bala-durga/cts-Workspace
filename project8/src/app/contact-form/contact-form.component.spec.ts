import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { COntactFormComponent } from './contact-form.component';

describe('COntactFormComponent', () => {
  let component: COntactFormComponent;
  let fixture: ComponentFixture<COntactFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ COntactFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(COntactFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
