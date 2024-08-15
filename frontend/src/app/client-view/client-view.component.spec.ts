import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClientView } from './client-view.component';

describe('ClientViewComponent', () => {
  let component: ClientView;
  let fixture: ComponentFixture<ClientView>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ClientView]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ClientView);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
