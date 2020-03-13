import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FashinComponent } from './fashin.component';

describe('FashinComponent', () => {
  let component: FashinComponent;
  let fixture: ComponentFixture<FashinComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FashinComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FashinComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
