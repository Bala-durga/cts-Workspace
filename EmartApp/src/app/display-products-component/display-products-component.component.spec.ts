import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayProductsComponentComponent } from './display-products-component.component';

describe('DisplayProductsComponentComponent', () => {
  let component: DisplayProductsComponentComponent;
  let fixture: ComponentFixture<DisplayProductsComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DisplayProductsComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DisplayProductsComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
