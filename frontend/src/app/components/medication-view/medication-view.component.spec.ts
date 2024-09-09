import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MedicationViewComponent } from './medication-view.component';

describe('MedicationViewComponent', () => {
  let component: MedicationViewComponent;
  let fixture: ComponentFixture<MedicationViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MedicationViewComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MedicationViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
