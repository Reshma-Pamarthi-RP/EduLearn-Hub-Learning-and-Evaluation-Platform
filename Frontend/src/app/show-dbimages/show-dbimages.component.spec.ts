import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowDbimagesComponent } from './show-dbimages.component';

describe('ShowDbimagesComponent', () => {
  let component: ShowDbimagesComponent;
  let fixture: ComponentFixture<ShowDbimagesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowDbimagesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowDbimagesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
