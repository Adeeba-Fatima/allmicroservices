import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SkillsignupComponent } from './skillsignup.component';

describe('SkillsignupComponent', () => {
  let component: SkillsignupComponent;
  let fixture: ComponentFixture<SkillsignupComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SkillsignupComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SkillsignupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
